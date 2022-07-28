package com.wxb.beginner.chapter17.thread;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadUse {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();//启动线程
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程 i=" + i + " 线程名=" + Thread.currentThread().getName());
        }

    }
}

class Cat extends Thread {
    int count = 0;
    @Override
    public void run() {
        //重写run方法，写上自己的业务逻辑
        while (true) {
            System.out.println("喵～～" + (++count) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 80) {
                break;
            }
        }

    }
}
