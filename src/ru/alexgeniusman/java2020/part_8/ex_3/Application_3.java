package ru.alexgeniusman.java2020.part_8.ex_3;

import javax.swing.*;

public class Application_3 {

    public Application_3(String path) {
        JFrame frame = new JFrame();
        frame.add(new AnimationImagePanel(path));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        if (args.length > 0) {
            new Application_3(args[0]);
        }
    }

}