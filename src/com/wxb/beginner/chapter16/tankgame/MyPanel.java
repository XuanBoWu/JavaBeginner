package com.wxb.beginner.chapter16.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex
 * @version 1.0
 */
public class MyPanel extends JPanel {
    MyTank myTank = null;
    public MyPanel() {
        myTank = new MyTank(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(43, 43, 43));
        g.fillRect(0, 0, 1000, 750);

        drawTank(myTank.getX(), myTank.getY(), g, 0, 0);

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
            case 1 :

        }
    }
}
