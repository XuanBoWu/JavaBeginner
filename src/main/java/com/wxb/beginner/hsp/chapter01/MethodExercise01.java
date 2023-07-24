package com.wxb.beginner.hsp.chapter01;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA aa = new AA();

        boolean bool = aa.isOdd(88);
        if (bool) {
            System.out.println("奇数");
        } else {
            System.out.println("偶数");
        }
    }
}

class AA {

    public boolean isOdd(int num) {
        return num % 2 != 0 ? true : false;
    }
}