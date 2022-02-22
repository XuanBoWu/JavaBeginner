package com.wxb.beginner.chapter02;


public class Demo03 {
    static int i222 = 123;
    int i111 = 0;



    public static void main(String[] args) {
            //整数拓展： 进制 二进制0b    十进制     八进制0     十六进制0x
            int i = 10;
            int i2 = 010;
            int i3 = 0x10;
            int i4 = 0b10;


            System.out.println(i);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            //字符拓展
            char ch = 'a';
            char ch2 = '中';

            Demo03 abc = new Demo03();

            System.out.println((int)ch);
            System.out.println((int)ch2);
            System.out.println(abc.i111);
            System.out.println(Demo03.i222);


            Graphics.printRectangular(21,6);

        }

    }

