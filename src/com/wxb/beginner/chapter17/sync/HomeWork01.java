package com.wxb.beginner.chapter17.sync;

import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;


/**
 * @author alex
 * @version 1.0
 */
public class HomeWork01{
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}

class T1 implements Runnable {
    boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            i = new Random().nextInt(100);
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class T2 implements Runnable {
    private T1 t1;
    private Scanner scanner = new Scanner(System.in);
    public T2(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true) {
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                t1.setFlag(false);
                break;
            }
        }
    }



}