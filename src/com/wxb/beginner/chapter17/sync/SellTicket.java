package com.wxb.beginner.chapter17.sync;

/**
 * @author alex
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        Ticket01 ticket01 = new Ticket01();
        Ticket02 ticket02 = new Ticket02();

        new Thread(ticket02).start();
        new Thread(ticket02).start();
    }
}


class Ticket01 extends Thread { //继承Thread
    private static int ticketNum = 100;
    @Override
    public synchronized void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已售罄。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 卖出第 " + (100 - (--ticketNum)) + " 张票");
        }
    }
}

class Ticket02 implements Runnable { //实现Runnable
    private static int ticketNum = 100;
    @Override
    public synchronized void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已售罄。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 卖出第 " + (100 - (--ticketNum)) + " 张票");
        }
    }
}
