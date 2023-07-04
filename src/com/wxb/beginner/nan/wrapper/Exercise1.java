package com.wxb.beginner.nan.wrapper;

import java.util.Scanner;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.wrapper
 * @className Exercise1
 * @description TODO
 * @date 2023/6/28 21:54
 */

/*
    练习一：包装类创建和转换
    理解Java包装类如何创建和转换是包装类基础。请编写一个Java程序，创建一个Integer包装类对象，然后使用该对象提供的方法把这个数字变为二进制，八进制和十六进制。
 */
public class Exercise1 {
    public static void main(String[] args) {
        Integer integer = 122;

        // 调用Integer的静态方法toString转换进制
        System.out.println("十进制：" + integer);
        System.out.println("二进制：" + Integer.toString(integer, 2));
        System.out.println("八进制：" + Integer.toString(integer, 8));
        System.out.println("十六进制：" + Integer.toString(integer, 16));
    }

}
