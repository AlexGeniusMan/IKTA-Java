package ru.alexgeniusman.java2020.part_10.ex_7;

import java.util.Scanner;

public class seven {
    private static void printDividers(int i, int n) {
        if (n <= i) {
            if (i % n == 0) {
                System.out.println(n);
                printDividers(i / n, n);
            } else {
                printDividers(i, n + 1);
            }
        }
    }

    public static void main(String[] args) {
        printDividers(1000, 2);
    }
}
