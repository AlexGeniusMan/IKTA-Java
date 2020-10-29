package ru.alexgeniusman.java2020.part_8.old.ex_2;

import javax.swing.*;
import java.awt.*;

class Main extends JFrame
{
    Main()
    {
        setContentPane(new ShowImage());
    }
    public static void main(String[] argv)
    {
        Main mypart2 = new Main();
        mypart2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = mypart2.getGraphics();
        mypart2.paintComponents(gr);
        mypart2.pack();
        mypart2.setVisible(true);
    }
}