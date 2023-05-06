package com.wxb.beginner.hsp.chapter01;

public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println(new T().monkeyEatPeach(10, 1));
    }
}
class T {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("输入有误");
            return -1;
        }
    }

    public int monkeyEatPeach(int day, int n) {
        /**
         * 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后
         * 每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃)， 发现只有1个桃子了。
         * 问题：最初共多少个桃子？
         *
         * 思路：逆推思维
         */

        if (n == day) {
            return 1;
        } else if (n < day && n > 0){
            return (monkeyEatPeach(day, n + 1) + 1) * 2;
        } else {
            System.out.println("输入错误！");
            return -1;
        }
    }
}
















