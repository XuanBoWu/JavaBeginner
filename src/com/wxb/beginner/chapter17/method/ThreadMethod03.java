package com.wxb.beginner.chapter17.method;

/**
 * @author alex
 * @version 1.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true   );
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程。。。");
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护线程。。。");
        }
    }
}

