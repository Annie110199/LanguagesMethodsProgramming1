package ru.omsu.imit.first_seminar;

public  class PriorityTask implements ITask, Comparable<PriorityTask>{
    private int[] arr;
    private int priority;

    @Override
    public int[] getData() {
        return arr;
    }

    @Override
    public int compareTo(PriorityTask o) {
        return this.priority - o.priority;

    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
