package ru.omsu.imit.first_seminar;

import java.util.Arrays;


    public class Task implements ITask {
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
