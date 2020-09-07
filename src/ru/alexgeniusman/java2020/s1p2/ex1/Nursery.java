package ru.alexgeniusman.java2020.s1p2.ex1;

import java.util.ArrayList;

public class Nursery {
    private Dog[] dogs = new Dog[1000];
    private int actualSize = 0;

    public void addSomeCuteDogs(Dog ... newDogs) {
        for (Dog el :
                newDogs) {
            dogs[actualSize%1000]=el;
            actualSize += 1;
        }
    }
}
