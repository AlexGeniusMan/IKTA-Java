package ru.alexgeniusman.java2020.part_7.ex_1;

public abstract class Dish {
    public abstract void wash();

    public abstract void clean();

    protected void crush() {
        System.out.println("Dish are broken");
    }
}
