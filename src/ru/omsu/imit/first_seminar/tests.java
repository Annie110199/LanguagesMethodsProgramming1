package ru.omsu.imit.first_seminar;


public class tests {
    public static void main(String[] args) {
        Task task1 = new Task(2, 15, -35);

        System.out.println(task1);
        System.out.println(task1.getData());
        System.out.println();

        SimpleBuffer buff1 = new SimpleBuffer();
        buff1.addElement(5);
        buff1.addElement(-3);
        buff1.addElement(75);
        System.out.println(buff1);
        System.out.println(buff1.getElement());
        buff1.clearBuffer();
        System.out.println(buff1.isEmpty());
        System.out.println();

        SimpleBuffer buff2 = new SimpleBuffer();
        SimpleTaskGenerator generator1 = new SimpleTaskGenerator(buff2,12,6);
        System.out.println(buff2);
        generator1.generate();
        System.out.println(buff2);
        generator1.withStartValue(-3);
        generator1.withAmount(17);
        generator1.generate();
        System.out.println(buff2);

        SimpleBuffer buff3 = new SimpleBuffer();
        ITaskGenerator generator = new SimpleTaskGenerator(buff3, 0, 1);
        ((SimpleTaskGenerator) generator).withStartValue(10).withAmount(3).generate();
        System.out.println(buff3);
        System.out.println();


        SimpleTaskProcessor processorBuff2 = new SimpleTaskProcessor(buff2);
        SimpleTaskProcessor processorBuff1 = new SimpleTaskProcessor(buff2);
        System.out.println(processorBuff2.process()+" buffer2 sum");
        System.out.println(processorBuff1.process()+" (empty buffer1 sum)");
    }
}
