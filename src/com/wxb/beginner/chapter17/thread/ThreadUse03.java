package com.wxb.beginner.chapter17.thread;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadUse03 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);

        thread3.start();
        thread4.start();

    }
}

class T3 implements Runnable {
    int count = 0;
    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello World!" + " " + (++count));
            if (count > 50) {
                break;
            }
        }
    }
}


class T4 implements Runnable {
    int count = 0;
    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi!" + " " + (++count));
            if (count > 30) {
                break;
            }
        }
    }
}