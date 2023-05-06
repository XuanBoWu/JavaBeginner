package com.wxb.beginner.hsp.MultiThread;

/**
 * @author alex
 * @version 1.0
 */
public class Race implements Runnable{
    private static String winner;
    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            if (Thread.currentThread().getName().equals("兔子") && i == 50) { //判断是否是兔子，如果是则在50步时休息
                try {
                    Thread.sleep(10); //兔子休息10毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (isGameOver(i)) { //判断是否决出胜负
                System.out.println(winner + " 获胜！");
                break;
            }

            System.out.println(Thread.currentThread().getName() + "跑了 " + i + "步");
        }
    }

    public boolean isGameOver(int steps) {
        if (winner != null) {
            return true;
        } else {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
