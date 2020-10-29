package ru.alexgeniusman.java2020.part_3.ex_2;

public class Test {

    public static void main(String[] args) {

        Hand hand = new Hand(58);
        Head head = new Head("brown", 3);
        Leg leg = new Leg(44);

        System.out.println(hand.toString());
        System.out.println(head.toString());
        System.out.println(leg.toString());

    }
}
