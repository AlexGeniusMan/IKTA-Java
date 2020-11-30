package ru.alexgeniusman.java2020.part_26.ex2;

public interface AbstractQueue<E> {

    void add(E element);

    E poll();

    boolean isEmpty();

}
