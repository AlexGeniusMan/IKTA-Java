package ru.alexgeniusman.java2020.part_7.ex_2;

public class Pug extends Dog {
    int old;
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public Pug(int old, int weight) {
        this.old = old;
        this.weight = weight;
    }

    @Override
    public void woo() {
    }

    @Override
    public void gav() {

    }
}
