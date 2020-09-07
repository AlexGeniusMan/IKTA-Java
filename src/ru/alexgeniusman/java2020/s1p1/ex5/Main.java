package ru.alexgeniusman.java2020.s1p1.ex5;

public class Main {

    public static void main(String[] args) {
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
    }
}
