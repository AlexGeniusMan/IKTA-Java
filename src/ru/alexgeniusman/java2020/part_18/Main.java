package ru.alexgeniusman.java2020.part_18;


import java.util.Scanner;

public class Main {

    // if i = 0 (int): exception
    //if i = 0.0 (float): INF

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            if (2.0/i==Float.POSITIVE_INFINITY) {
                System.out.println("INF");
            }
            else {
                System.out.println(2.0/i);
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("DIVISION BY ZERO");
        }


    }
    public static void main(String[] args) {
        Main main = new Main();
        main.exceptionDemo();
    }
}