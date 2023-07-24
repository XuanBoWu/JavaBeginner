package com.wxb.beginner.hsp.chapter02;

public class HelloWorld {
    public static void main(String[] args){
        //打印方法
        System.out.println("这是第一个Java程序！");
        System.out.println("这是第一个" +
                "Java程序！");

        /**
         * @Description HelloWorld
         * @Aurhor WXB
         *
         */

//*******************************************************************************
        //标识符注意点

        // 以字母、美元符号或者下划线开始
        String Abc = "HelloWorld";
        String abc = "HelloWorld";
        String $abc = "HelloWorld";
        String _abc = "HelloWorld";
        //不能使用数字或者其他符号
//        String 1ABC = "HelloWorld";
//        String #ABC = "HelloWorld";
        //大小写敏感
        String Man = "WXB";
        String man = "WXB";

//*******************************************************************************
        // 数据类型
        /**
         * 1、 Java是强类型语言，变量需要定义后才可以使用
         * 2、
         * 3、
         *
         */


        //八大基本数据类型

        //整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;//后面要加L

        //小数
        float num5 = 50.1F;
        double num6 = 50.21;

        //字符
        char name = '国';
        //布尔值
        boolean flag = false;


//*******************************************************************************


























    }
}
