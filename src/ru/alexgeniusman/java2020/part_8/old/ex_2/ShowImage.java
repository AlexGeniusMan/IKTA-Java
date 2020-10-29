package ru.alexgeniusman.java2020.part_8.old.ex_2;

import javax.swing.*;
import java.awt.*;

class ShowImage extends JPanel
{
    private Image img;

    ShowImage()
    {
        img = getToolkit().getImage(".\\cat.jpg");
        setPreferredSize(new Dimension(820, 620));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 10, 10, this);
    }
}