package com.wxb.beginner.chapter_18;

/**
 * @author alex
 * @version 1.0
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TankGame extends JPanel {
    private int x = 50; // 玩家坦克起始横坐标
    private int y = 50; // 玩家坦克起始纵坐标
    private boolean up = false, down = false, left = false, right = false; // 四个方向的状态
    private List<Tank> tanks = new ArrayList<Tank>(); // 敌方坦克列表


    public TankGame() {
        // 创建窗口
        JFrame frame = new JFrame("TankGame");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyMonitor());
        setFocusable(true);


        // 在窗口上生成五个敌方坦克
        for (int i = 0; i < 5; i++) {
            tanks.add(new Tank((i + 1) * 100, (i + 1) * 100));
        }

        while (true) {

        }



    }

    public void paint(Graphics g) {
        super.paint(g);
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
        g.setColor(c);

        // 绘制所有敌方坦克
        for (Tank tank : tanks) {
            tank.draw(g);
        }

        // 根据四个方向的状态来改变玩家坦克位置
        if (up)
            y -= 5;
        else if (down)
            y += 5;
        else if (left)
            x -= 5;
        else if (right)
            x += 5;
    }

    public static void main(String[] args) {
        new TankGame();
    }


    class Tank {
        int x, y; // 坦克的位置

        public Tank(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void draw(Graphics g) {
            Color c = g.getColor();
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 30, 30);
            g.setColor(c);
        }
    }

    class KeyMonitor extends java.awt.event.KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_UP:
                    up = true;
                    break;
                case KeyEvent.VK_DOWN:
                    down = true;
                    break;
                case KeyEvent.VK_LEFT:
                    left = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = true;
                    break;
            }
        }

        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_UP:
                    up = false;
                    break;
                case KeyEvent.VK_DOWN:
                    down = false;
                    break;
                case KeyEvent.VK_LEFT:
                    left = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = false;
                    break;
            }
        }
    }
}
