package com.wxb.beginner.chapter_18;


/**
 * @author alex
 * @version 1.0
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 坦克游戏主类
 */
public class TankBattle {
    public static void main(String[] args) {
        JFrame frame = new JFrame("坦克对战");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.addKeyListener(gamePanel);
        frame.setVisible(true);
    }
}

/**
 * 游戏面板类，负责绘制坦克和处理按键事件
 */
class GamePanel extends JPanel implements KeyListener {
    private Tank player1 = new Tank(100, 400);
    private Tank player2 = new Tank(700, 400);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        player1.draw(g);
        player2.draw(g);
    }

    /**
     * 处理按键事件
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_W:
                player1.moveUp();
                break;
            case KeyEvent.VK_S:
                player1.moveDown();
                break;
            case KeyEvent.VK_A:
                player1.moveLeft();
                break;
            case KeyEvent.VK_D:
                player1.moveRight();
                break;
            case KeyEvent.VK_UP:
                player2.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                player2.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                player2.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                player2.moveRight();
                break;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

/**
 * 坦克类，包含位置、绘制方法和移动方法
 */
class Tank {
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 绘制坦克
     */
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 50);
    }

    /**
     * 移动方法
     */
    public void moveUp() {
        if (y > 0) {
            y -= 10;
        }
    }

    public void moveDown() {
        if (y < 550) {
            y += 10;
        }
    }

    public void moveLeft() {
        if (x > 0) {
            x -= 10;
        }
    }

    public void moveRight() {
        if (x < 750) {
            x += 10;
        }
    }
}