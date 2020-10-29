package ru.alexgeniusman.java2020.part_7.ex_2;

public class Corgi extends Dog {
    int age;
    String name;

    public Corgi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void gav() {
    }

    @Override
    public void woo() {
    }
}
