package com.wxb.beginner.hsp.chapter08.debug;

public class Debug01 {
    public static void main(String[] args) {
        // 演示代码
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
        System.out.println("for循环结束。");
    }
}
