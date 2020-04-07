package ru.omsu.imit.first_seminar;

public class SimpleTaskGenerator implements ITaskGenerator{
    private SimpleBuffer buff;
    private int startValue;
    private int amount;
    public SimpleTaskGenerator(SimpleBuffer b, int startVal, int amoun){
        buff=b;
        startValue=startVal;
        amount=amoun;
    }
    @Override
    public void generate() {
        for(int i=startValue;i<startValue+amount;++i){
            buff.addElement(i);
        }
    }
    public SimpleTaskGenerator withStartValue(int startValue){
        this.startValue = startValue;
        return this;
    }
    public SimpleTaskGenerator withAmount(int amount){
        this.amount = amount;
        return this;
    }
}
