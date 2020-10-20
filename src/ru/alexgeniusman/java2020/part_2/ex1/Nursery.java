package ru.alexgeniusman.java2020.part_2.ex1;

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
