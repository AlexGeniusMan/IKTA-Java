package ru.alexgeniusman.java2020.part_8.old.ex_1;

import javax.swing.*;
import java.awt.*;

class Figure extends JComponent {
    private Color color;
    private int type;

    Figure(Color color, int type) {
        this.color = color;
        this.type = type;
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        switch (type) {
            case 0:
                g.fillOval(0, 0, 90, 90);
                break;
            case 1:
                g.fillRect(0, 0, 130, 80);
                break;
        }
    }
}