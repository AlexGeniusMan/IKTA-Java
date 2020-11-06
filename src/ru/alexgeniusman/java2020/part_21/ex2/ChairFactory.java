package ru.alexgeniusman.java2020.part_21.ex2;

public abstract class ChairFactory implements AbstractChairFactory{
    public abstract VictorianChair createVictorianChair();
    public abstract MagicalChair createMagicalChair();
    public abstract MultifunctionalChair createMultifunctionalChair();
}