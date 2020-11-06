package ru.alexgeniusman.java2020.part_21.ex3;

import javax.swing.*;

public class Application extends JFrame implements IDocument {
    public Application() {
        createGUI();
        pack();
    }
    public static void main(String[] args) {
        new Application();
    }
}
