package com.wxb.beginner.chapter18.tankgam3;

/**
 * @author alex
 * @version 1.0
 */
public class Shot implements Runnable {
    int x; //子弹x坐标
    int y; //子弹y坐标
    int direct = 0; //子弹方向
    int speed = 2;  //子弹速度
    boolean isLive = true; //是否存在

    //构造器


    public Shot(int x, int y, int direct, int speed) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.speed = speed;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct) {
                case 0: // 上
                    y -= speed;
                    break;
                case 1: // 右
                    x += speed;
                    break;
                case 2: // 下
                    y += speed;
                    break;
                case 3: // 左
                    x -= speed;
                    break;
            }
            System.out.println("坐标(" + x + "," + y + ")");

            if ( !(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                break;
            }

        }
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
