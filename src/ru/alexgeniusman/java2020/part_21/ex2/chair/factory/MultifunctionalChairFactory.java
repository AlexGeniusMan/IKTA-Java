package ru.alexgeniusman.java2020.part_21.ex2.chair.factory;

import ru.alexgeniusman.java2020.part_21.ex2.chair.Chair;
import ru.alexgeniusman.java2020.part_21.ex2.chair.MultifunctionalChair;

public class MultifunctionalChairFactory implements AbstractChairFactory {

    @Override
    public Chair create() {
        return new MultifunctionalChair();
    }

}
