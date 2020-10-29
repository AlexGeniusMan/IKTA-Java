package ru.alexgeniusman.java2020.part_7.ex_2;

public class Test {
    public static void main(String[] args) {
        Corgi sobaken = new Corgi("Astrid", 3);
        Pug mops = new Pug(7, 12);
        System.out.println(sobaken.getName() + " " + sobaken.getAge());
        System.out.println(mops.getOld() + " " + mops.getWeight());
    }
}
