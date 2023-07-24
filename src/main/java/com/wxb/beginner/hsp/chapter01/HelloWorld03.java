package com.wxb.beginner.hsp.chapter01;

public class HelloWorld03 {
    public static void main(String[] args) {


        int a = 4;
        int b = 9;

        //使用短路与 &&
        if (a < 1 && ++b > 6) {
            System.out.println("ok");
        }
        System.out.println("短路与 &&：" + "b = " + b);

        a = 4;
        b = 9;
        //使用与 &
        if (a < 1 & ++b > 6) {
            System.out.println("OK");
        }
        System.out.println("与 &：" + "b = " + b);

        System.out.println(~2);
        System.out.println(2&3);
        System.out.println(2|3);
        System.out.println(~-5);
        System.out.println(13&7);
        System.out.println(5|4);
        System.out.println(-3^3);



    }
}
