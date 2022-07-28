package com.wxb.beginner.chapter17.method;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + "运行中～" + i);
            if (i == 5) {
                System.out.println("main 让路");
                t2.join();
            }
        }
        try {
            System.out.println(Thread.currentThread().getName() + "休眠中～");
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + "运行中～" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "休眠中～");
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
        }

    }
}