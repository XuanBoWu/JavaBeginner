package com.wxb.beginner.chapter18.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author alex
 * @version 1.0
 */
public class MyPanel extends JPanel implements KeyListener {
    MyTank myTank = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
        myTank = new MyTank(100, 100, 2, 0);
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1), 0, 2, 1));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(43, 43, 43));
        g.fillRect(0, 0, 1000, 750);

        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), myTank.getType());
        for (EnemyTank enemyTank : enemyTanks) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), enemyTank.getType());
        }
    }

    /**
     *
     * @param x
     * @param y
     * @param g 画笔
     * @param direct 方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0 :
                // 玩家
                g.setColor(new Color(102, 156, 179));
                break;
            case 1 :
                //敌人
                g.setColor(new Color(208, 151, 59));
                break;
            default:

        }

        switch (direct) {
            case 0 :
                g.fill3DRect(x, y, 10, 50, true);
                g.fill3DRect(x + 30, y, 10, 50, true);
                g.fill3DRect(x + 10, y + 10, 20, 30, true);
                g.fill3DRect(x + 19, y, 2, 25, true);
                g.setColor(new Color(g.getColor().getRed(), g.getColor().getGreen() + 50, g.getColor().getBlue() + 50));
                g.fillOval(x + 10, y + 15, 20, 20);
                break;
            case 1 :
                g.fill3DRect(x - 5, y + 5, 50, 10, true);
                g.fill3DRect(x - 5, y + 35, 50, 10, true);
                g.fill3DRect(x + 5, y + 15, 30, 20, true);
                g.fill3DRect(x + 20, y + 25, 25, 2, true);
                g.setColor(new Color(g.getColor().getRed(), g.getColor().getGreen() + 50, g.getColor().getBlue() + 50));
                g.fillOval(x + 10, y + 15, 20, 20);
                break;
            case 2 :
                g.fill3DRect(x, y, 10, 50, true);
                g.fill3DRect(x + 30, y, 10, 50, true);
                g.fill3DRect(x + 10, y + 10, 20, 30, true);
                g.fill3DRect(x + 19, y + 25, 2, 25, true);
                g.setColor(new Color(g.getColor().getRed(), g.getColor().getGreen() + 50, g.getColor().getBlue() + 50));
                g.fillOval(x + 10, y + 15, 20, 20);
                break;
            case 3 :
                g.fill3DRect(x - 5, y + 5, 50, 10, true);
                g.fill3DRect(x - 5, y + 35, 50, 10, true);
                g.fill3DRect(x + 5, y + 15, 30, 20, true);
                g.fill3DRect(x - 5, y + 25, 25, 2, true);
                g.setColor(new Color(g.getColor().getRed(), g.getColor().getGreen() + 50, g.getColor().getBlue() + 50));
                g.fillOval(x + 10, y + 15, 20, 20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) {
            if (myTank.getDirect() == 0) {
                myTank.setY(myTank.getY() - 5);
            } else {
                myTank.setDirect(0);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            if (myTank.getDirect() == 1) {
                myTank.setX(myTank.getX() + 5);
            } else {
                myTank.setDirect(1);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            if (myTank.getDirect() == 2) {
                myTank.setY(myTank.getY() + 5);
            } else {
                myTank.setDirect(2);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            if (myTank.getDirect() == 3) {
                myTank.setX(myTank.getX() - 5);
            } else {
                myTank.setDirect(3);
            }
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
