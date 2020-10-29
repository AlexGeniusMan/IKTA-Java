package ru.alexgeniusman.java2020.badTasks.part_3.ex5;

public class TestClass {
    public static void main(String[] arg)
    {
        MovableRectangle rectangle = new MovableRectangle(
                1, 1, 2,3, 3, 4);
        System.out.println(rectangle.toString());
        rectangle.moveRight();
        System.out.println("speed equals = " + rectangle.SpeedPointEquals());
        System.out.println(rectangle.toString());
        //System.
    }
}
