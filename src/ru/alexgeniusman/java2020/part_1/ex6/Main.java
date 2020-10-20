package ru.alexgeniusman.java2020.part_1.ex6;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("<---6--->");
        int[] arr_1 = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arr_1[i] = random.nextInt();
        }
        System.out.println("#1 unsorted");
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_1[i]);
        }
        System.out.println("#1 sorted");
        Arrays.sort(arr_1);
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_1[i]);
        }
        System.out.println("#2 unsorted");
        int[] arr_2 = new int[10];
        for (int i = 0; i < 10; i++) {
            double temp_u = Math.random() * 1000000000;
            arr_2[i] = (int)Math.round(temp_u);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_2[i]);
        }
        System.out.println("#2 sorted");
        Arrays.sort(arr_1);
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_2[i]);
        }
    }
}
