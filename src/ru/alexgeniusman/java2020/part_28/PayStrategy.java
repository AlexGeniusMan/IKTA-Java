package ru.alexgeniusman.java2020.part_28;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
