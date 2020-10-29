package ru.alexgeniusman.java2020.part_8.ex_2;

import javax.swing.*;

public class Application {

    public Application(String path) {
        JFrame frame = new JFrame();
        frame.add(new ImagePanel(path));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        if (args.length > 0) {
            new Application(args[0]);
        }
    }

}