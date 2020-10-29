package ru.alexgeniusman.java2020.part_7.ex_1;

public class Pan extends Dish {
    double diameter;
    double height;
    String name;
    int cost;

    public Pan(String name, double diameter, double height) {
        this.name = name;
        this.diameter = diameter;
        this.height = height;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void clean() {
    }

    @Override
    public void wash() {

    }
}
