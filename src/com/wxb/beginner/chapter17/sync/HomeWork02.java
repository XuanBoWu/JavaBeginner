package com.wxb.beginner.chapter17.sync;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Bank01 bank01 = new Bank01();
        Thread t1 = new Thread(bank01, "t1");
        Thread t2 = new Thread(bank01, "t2");
        t1.start();
        t2.start();
    }
}

class Bank01 implements Runnable {
    private static double balance = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (balance < 1000) {
                    System.out.println("余额不足");
                    break;
                }
                balance = balance - 1000;
                System.out.println(Thread.currentThread().getName() + "已支取人民币" + 1000 + "元" + "，余额为" + balance + "元");
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}