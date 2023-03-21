package com.wxb.beginner.MultiThread;

/**
 * @author alex
 * @version 1.0
 */

    // Runnable 多个线程操作同一个对象


public class TestThread4 implements Runnable {
    // 卖票
    int ticketNums = 10;
    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---> 拿到了第" + ticketNums-- + "张票");
        }
    }

    public static void main(String[] args) {
        //可以实现多线程同时操作同一个对象，但是不能解决线程安全问题
        TestThread4 ticket = new TestThread4();
        new Thread(ticket, "No.1").start();
        new Thread(ticket, "No.2").start();
        new Thread(ticket, "No.3").start();

    }
}
