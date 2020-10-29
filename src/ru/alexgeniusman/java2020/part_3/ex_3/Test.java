package ru.alexgeniusman.java2020.part_3.ex_3;

public class Test {

    public static void main(String[] args) {

        Book kniga1 = new Book("Хемингуэй", "По ком звонит колокол?", 1940, 290);
        System.out.println(kniga1.getAuthor() + " " + kniga1.getName() + " " + kniga1.getYear() + " " + kniga1.getLabel());
    }
}
