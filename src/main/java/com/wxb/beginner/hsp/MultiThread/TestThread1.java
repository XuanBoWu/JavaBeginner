package com.wxb.beginner.hsp.MultiThread;

/**
 * @author alex
 * @version 1.0
 */

// 多线程实例
public class TestThread1 extends Thread { // 继承Thread class


    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程" + i);
            try {
                Thread.sleep(100); //睡眠100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread1 testThread = new TestThread1();
        testThread.start(); //启动子线程

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(100);
        }
    }
}
