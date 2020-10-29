package ru.alexgeniusman.java2020.part_8.old.ex_1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;

    public Main() {
        super("Window of Figures");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int i = 1; i < 21; i++) {
            int r = (int) (Math.random() * ((256)));
            int gr = (int) (Math.random() * ((256)));
            int b = (int) (Math.random() * (256));
            Color cr = new Color(r, gr, b);
            int t = (int) (Math.random() * (2));
            System.out.println(t);
            Figure figure = new Figure(cr, t);
            int x1 = (int) (Math.random() * (700));
            int x2 = (int) (Math.random() * 400);
            figure.setBounds(x1, x1, x2, x2);
            switch (t) {
                case 0:
                    lp.add(figure, JLayeredPane.POPUP_LAYER);
                    break;
                case 1:
                    lp.add(figure, JLayeredPane.PALETTE_LAYER);
                    break;
            }

        }
        setSize(1000, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}
