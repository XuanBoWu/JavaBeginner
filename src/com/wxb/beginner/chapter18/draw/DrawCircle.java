package com.wxb.beginner.chapter18.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex
 * @version 1.0
 */
public class DrawCircle extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(300, 300);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    int count = 0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println(++count);
        g.setColor(new Color(102, 156, 179));
        g.fillRect(100, 100, 10, 50);
        g.fillRect(130, 100, 10, 50);
        g.fillRect(110, 110, 20, 30);
        g.setColor(new Color(151, 224, 251));
        g.fillOval(110, 115, 20, 20);
        g.fillRect(119, 100, 2, 25);
    }
}
