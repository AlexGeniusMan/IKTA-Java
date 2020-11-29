package ru.alexgeniusman.java2020.part_21.ex2;

import ru.alexgeniusman.java2020.part_21.ex2.chair.Chair;

public class Client {

    public void sit(Chair chair) {
        System.out.println("I'm sitting on " + chair.getType() + " chair!");
    }
}
