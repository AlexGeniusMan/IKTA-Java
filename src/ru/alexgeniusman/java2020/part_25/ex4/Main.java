package ru.alexgeniusman.java2020.part_25.ex4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List.of(
                "()()()",
                "((()))",
                ")))(((",
                "()()((",
                "))))))"
        ).stream().map(ExpressionUtils::isBracketsBalanced)
                .forEach(System.out::println);
    }

}
