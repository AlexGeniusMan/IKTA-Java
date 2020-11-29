package ru.alexgeniusman.java2020.part_21.ex2.chair.factory;

import ru.alexgeniusman.java2020.part_21.ex2.chair.Chair;
import ru.alexgeniusman.java2020.part_21.ex2.chair.VictorianChair;

public class VictorianChairFactory implements AbstractChairFactory {

    @Override
    public Chair create() {
        return new VictorianChair();
    }

}
