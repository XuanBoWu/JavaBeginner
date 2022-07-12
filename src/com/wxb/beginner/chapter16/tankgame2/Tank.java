package com.wxb.beginner.chapter16.tankgame2;

/**
 * @author alex
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int direct;
    private int type;

    public Tank(int x, int y, int direct, int type) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.type = type;
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
