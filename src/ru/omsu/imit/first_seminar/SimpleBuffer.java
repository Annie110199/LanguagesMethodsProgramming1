package ru.omsu.imit.first_seminar;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleBuffer implements IBuffer   {
    private Queue<Integer> que;


    public SimpleBuffer() {
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
