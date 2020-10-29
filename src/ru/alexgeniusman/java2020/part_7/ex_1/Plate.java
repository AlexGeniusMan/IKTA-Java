package ru.alexgeniusman.java2020.part_7.ex_1;

public class Plate extends Dish {
    String name;
    int costs;
    int price;

    @Override
    public void wash() {
    }

    @Override
    public void clean() {
    }

    public Plate(String name, int costs) {
        this.name = name;
        this.costs = costs;
    }

    public int getcosts() {
        return costs;
    }

    public void setcosts(int costs) {
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
