package com.wxb.beginner.chapter18.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author alex
 * @version 1.0
 */
public class BallMove extends JFrame{
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(500, 500);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 10, 10);
    }

    // 监听键盘输入
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //按键按下
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {
            y += 4;
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            y -= 4;
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            x -= 4;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            x += 4;
        }
        this.repaint();
    }
    //按键释放
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
