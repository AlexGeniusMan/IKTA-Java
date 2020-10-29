package ru.alexgeniusman.java2020.part_7.ex_3;

public class Chair extends Furniture {
    int CountOfLegs;
    int costs;

    @Override
    public void DoorClose() {
    }

    @Override
    public void DoorOpen() {
    }

    public Chair(int CountOfLegs, int costs){
        this.CountOfLegs=CountOfLegs;
        this.costs=costs;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getCountOfLegs() {
        return CountOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        CountOfLegs = countOfLegs;
    }
}
