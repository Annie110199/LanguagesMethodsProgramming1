package ru.omsu.imit.first_seminar;

public class SimpleTaskProcessor implements ITaskProcessor{
    private SimpleBuffer buffer;
    public SimpleTaskProcessor(SimpleBuffer buffer){
        this.buffer = buffer;
    }
    @Override
    public int process() {
        if(buffer.isEmpty())
            return 0;
        else{
            int sum = 0;
            Object[] a = buffer.getData().toArray();
            for (Object temp:a) {
                sum += (int) temp ;
            }
            return sum;
        }
    }

}