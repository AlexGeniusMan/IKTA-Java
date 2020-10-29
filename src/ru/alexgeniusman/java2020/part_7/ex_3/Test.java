package ru.alexgeniusman.java2020.part_7.ex_3;

public class Test {
    public static void main(String[] args) {
        Table stol = new Table("Wood", 3.75);
        Chair stul = new Chair(4, 400);
        System.out.println(stol.getMaterial()+" "+stol.getSquare());
        System.out.println(stul.getCountOfLegs()+" "+ stul.getCosts());
    }
}
