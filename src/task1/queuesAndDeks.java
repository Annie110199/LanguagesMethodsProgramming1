package task1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
//import

public class queuesAndDeks {
    public interface ITask{
        int[] getData();
    }
    static class Task implements ITask {
        private int[] arr;

        public int[] getData() {
            return arr;
        }

        Task(int val) {
            arr = new int[1];
            arr[0] = val;
        }

        Task(int val1, int val2) {
            arr = new int[2];
            arr[0] = val1;
            arr[1] = val2;
        }

        Task(int val1, int val2, int val3) {
            arr = new int[3];
            arr[0] = val1;
            arr[1] = val2;
            arr[2] = val3;
        }
        Task(int[] ar){
            arr = ar;
        }


        @Override
        public boolean equals(Object obj) {
            if(obj.hashCode()==this.hashCode())
            return true;
            else return false;
        }

        @Override
        public int hashCode() {
            return arr.hashCode();
        }

        @Override
        public String toString() {
            return "Task{" +
                    "arr=" + Arrays.toString(arr) +
                    '}';
        }
    }



    public interface IBuffer{
        void addElement(int element);
        int numberOfElements();
        int getElement();
        void clearBuffer();
        boolean isEmpty();
    }


    static class SimpleBuffer implements IBuffer   {
        Queue<Integer> que;


        SimpleBuffer() {
            que = new PriorityQueue<>();
        }

        @Override
        public void addElement(int element) {
            que.add(element);
        }

        @Override
        public int numberOfElements() {
            return que.size();
        }

        @Override
        public int getElement() {
            return que.element();
        }

        @Override
        public void clearBuffer() {
            que.clear();
        }

        @Override
        public boolean isEmpty() {
            return que.isEmpty();
        }

        public Queue<Integer> getData() {
            return que;
        }

        @Override
        public String toString() {
            return "SimpleBuffer{" +
                    "que=" + que +
                    '}';
        }
    }


    interface ITaskGenerator{
        void generate();
    }
    static class SimpleTaskGenerator implements ITaskGenerator{
        SimpleBuffer buff;
        int startValue;
        int amount;
        SimpleTaskGenerator(SimpleBuffer b, int startVal, int amoun){
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

    interface ITaskProcessor{
        int process(SimpleBuffer task);
    }
    static class SimpleTaskProcessor implements ITaskProcessor{

        @Override
        public int process(SimpleBuffer task) {
            if(task.isEmpty())
                return 0;
            else{
                int sum = 0;
                Object[] a = task.getData().toArray();
                for (Object temp:a) {
                    sum += (int) temp ;
                }
                return sum;
            }
        }

    }


    class PriorityTask implements ITask, Comparable<PriorityTask>{
        private int[] arr;
        private int priority;

        @Override
        public int[] getData() {
            return arr;
        }

        @Override
        public int compareTo(PriorityTask o) {
            if(this.priority>o.priority)
            return 1;
            else if(this.priority==o.priority)return 0;
            else return -1;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }

}
