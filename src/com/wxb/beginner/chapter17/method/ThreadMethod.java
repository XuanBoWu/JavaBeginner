package com.wxb.beginner.chapter17.method;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("alex");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }
        t.interrupt();
        System.out.println(t.getName());
    }
}

class T extends Thread {
    @Override
    public void run() {
        while(true) {
            for (int i = 0; i < 10; i++) {
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
}
