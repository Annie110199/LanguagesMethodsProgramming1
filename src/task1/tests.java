package task1;

public class tests {
    public static void main(String[] args) {
        queuesAndDeks.Task task1 = new queuesAndDeks.Task(2, 15, -35);

        System.out.println(task1);
        System.out.println(task1.getData());
        System.out.println();

        queuesAndDeks.SimpleBuffer buff1 = new queuesAndDeks.SimpleBuffer();
        buff1.addElement(5);
        buff1.addElement(-3);
        buff1.addElement(75);
        System.out.println(buff1);
        System.out.println(buff1.getElement());
        buff1.clearBuffer();
        System.out.println(buff1.isEmpty());
        System.out.println();

        queuesAndDeks.SimpleBuffer buff2 = new queuesAndDeks.SimpleBuffer();
        queuesAndDeks.SimpleTaskGenerator generator1 = new queuesAndDeks.SimpleTaskGenerator(buff2,12,6);
        System.out.println(buff2);
        generator1.generate();
        System.out.println(buff2);
        generator1.withStartValue(-3);
        generator1.withAmount(17);
        generator1.generate();
        System.out.println(buff2);

        queuesAndDeks.SimpleBuffer buff3 = new queuesAndDeks.SimpleBuffer();
        queuesAndDeks.ITaskGenerator generator = new queuesAndDeks.SimpleTaskGenerator(buff3, 0, 1);
        ((queuesAndDeks.SimpleTaskGenerator) generator).withStartValue(10).withAmount(3).generate();
        System.out.println(buff3);
        System.out.println();


        queuesAndDeks.SimpleTaskProcessor processor = new queuesAndDeks.SimpleTaskProcessor();
        System.out.println(processor.process(buff2)+" buffer2 sum");
        System.out.println(processor.process(buff1)+" (empty buffer1 sum)");
    }
}
