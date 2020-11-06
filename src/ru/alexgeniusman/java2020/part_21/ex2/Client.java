package ru.alexgeniusman.java2020.part_21.ex2;

public abstract class Client implements Chair{
    Chair chair;
    public abstract void sit();
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
