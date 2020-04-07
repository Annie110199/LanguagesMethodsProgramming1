package ru.omsu.imit.first_seminar;

public interface IBuffer{
    void addElement(int element);
    int numberOfElements();
    int getElement();
    void clearBuffer();
    boolean isEmpty();
}
