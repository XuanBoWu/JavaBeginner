package com.wxb.beginner.chapter17.exit;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setLoop(false);
    }
}

class T1 extends Thread {
    int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中～ " + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}