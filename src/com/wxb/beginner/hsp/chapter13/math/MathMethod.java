package com.wxb.beginner.hsp.chapter13.math;

/**
 * @author alex
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        System.out.println(abs);

        double pow = Math.pow(2, 4);
        System.out.println(pow);

        double ceiling = Math.ceil(-3.0002);
        System.out.println(ceiling);

        double floor = Math.floor(3.23);
        System.out.println(floor);

        long round = Math.round(5.5);
        System.out.println(round);

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}

