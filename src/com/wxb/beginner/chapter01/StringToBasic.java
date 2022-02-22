package com.wxb.beginner.chapter01;

public class StringToBasic {
    public static void main(String[] args) {
        //基本数据类型 转 String
        int a = 100;
        int b = 200;

        String c = a + "";
        String d = b + "";
        System.out.println(c + d);//输出："100200"

        //String 转 基本数据类型
        String s1 = "123";
        String s2 = "321";
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        System.out.println(num1 + num2);//输出："444"

        //String 转 char

        String s3 = "123";
        char c1 = s3.charAt(0);
        char c2 = s3.charAt(2);
        System.out.println(c1 + c2);//输出：100（）

    }
}
