package com.wxb.beginner.chapter17.method;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        Thread thread = new Thread(t4);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "Hi " + (i+1));
            if (i == 4) {
                System.out.println("mian让路");
                thread.start();
                thread.join();
                System.out.println("子线程结束");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("主线程结束");
    }
}

class T4 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "Hello " + (i+1));
        }
    }
}