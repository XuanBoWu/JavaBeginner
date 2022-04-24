package com.wxb.beginner.chapter13.homework;

import java.util.Scanner;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符：");
        String str =  scanner.next();

        System.out.println("输入开始索引：");
        int start = scanner.nextInt();

        System.out.println("输入结束索引：");
        int end = scanner.nextInt();
        System.out.println(reverse(str, start, end));

    }

    public static String reverse(String str, int start, int end) {
        StringBuilder builder = new StringBuilder(str);

        StringBuilder tmp = new StringBuilder(builder.substring(start, end));
        tmp.reverse();
        builder.replace(start, end, tmp.toString());

        return builder.toString();
    }
}
