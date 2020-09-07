package ru.alexgeniusman.java2020;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("<---3--->");
        int[] arr = {1, 6, 4, 3};
        for (int el:arr) {
            System.out.println(el);
        }
        System.out.println("<---4--->");
        for (String el :
                args) {
            System.out.println(el);
        }
        System.out.println("<---5--->");
        double temp_num;
        for (int i = 1; i <= 10; i++) {
            temp_num = 1.0/i;
            if (i == 1) {
                System.out.printf("Num №" + (i + 1) + " = \t%.2f or " + i + "\n", temp_num);
            }
            else{
                System.out.printf("Num №" + (i + 1) + " = \t%.2f or 1/" + i + "\n", temp_num);
            }
        }
        System.out.println("<---6--->");
        int[] arr_1 = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arr_1[i] = random.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_1[i]);
        }
        Arrays.sort(arr_1);
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_1[i]);
        }
        int[] arr_2 = new int[10];
        for (int i = 0; i < 10; i++) {
            double temp_u = Math.random() * 1000000000;
            arr_2[i] = (int)Math.round(temp_u);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_2[i]);
        }
        Arrays.sort(arr_1);
        for (int i = 0; i < 10; i++) {
            System.out.println("El №" + (i + 1) + " = \t" + arr_2[i]);
        }
        System.out.println("<---7--->");
        System.out.println(calculateFactorial(5));
    }

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i ++){
            result = result*i;
        }
        return result;
    }
}
