package ru.alexgeniusman.java2020.badTasks.part_1.ex7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("<---7--->");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int temp_n = keyboard.nextInt();
        System.out.println("Factorial of number " + temp_n + ": " + calculateFactorial(temp_n));
    }

    static int calculateFactorial(int temp_n){
        int result = 1;
        for (int i = 1; i <= temp_n; i ++){
            result = result*i;
        }
        return result;
    }
}
