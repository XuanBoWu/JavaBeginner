package com.wxb.beginner.chapter_18;

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
        System.out.println("Program exit!");
    }

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2000, 2000);
        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(100,100, 1000,1000);
        System.out.println("call paint!");
    }

}
