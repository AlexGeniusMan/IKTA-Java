package ru.alexgeniusman.java2020.part_27.ex1;

import java.util.Scanner;

public class CalculatorView {

    public String getExpression() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printResult(int result) {
        System.out.println("Result is " + result);
    }

    public void printException(Exception exception) {
        System.err.println("Calculation resulted with exception: " + exception.getMessage());
    }

}
