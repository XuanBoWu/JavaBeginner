package com.wxb.beginner.chapter18.tankgam3;

/**
 * @author alex
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direct;
    private int type;
    private Shot shot = null;

    public Tank(int x, int y, int direct, int type) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.type = type;
    }

    public void shotEnemyTank() {

        int speed = 2;
        switch (getDirect()) {
            case 0: // 上
                shot = new Shot(x + 20, y, direct, speed);
                break;
            case 1: // 右
                shot = new Shot(x + 50, y + 20, direct, speed);
                break;
            case 2: // 下
                shot = new Shot(x + 20, y + 50, direct, speed);
                break;
            case 3: // 左
                shot = new Shot(x, y + 20, direct, speed);
                break;
        }
        new Thread(shot).start();

    }

    public Shot getShot() {
        return shot;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
