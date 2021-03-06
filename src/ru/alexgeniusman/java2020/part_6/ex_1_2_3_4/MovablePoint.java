package ru.alexgeniusman.java2020.part_6.ex_1_2_3_4;

import ru.alexgeniusman.java2020.part_5.ex_1.Movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp() {
    }

    ;

    public void moveDown() {
    }

    ;

    public void moveLeft() {
    }

    ;

    public void moveRight() {
    }

    ;
}



