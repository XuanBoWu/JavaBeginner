package com.wxb.beginner.hsp.chapter13.string_;

import java.util.Scanner;

/**
 * @author alex
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String num = scanner.next();
            System.out.println(formatNumber(num));
        }

    }

    public static String formatNumber(String str) {
        StringBuffer sb = new StringBuffer(str);
        int dotIndex = sb.indexOf(".");
        int len = sb.length();
        if (dotIndex != -1){
            for (int i = 1; i < dotIndex / 3 + 1; i++) { // 10000.000
                int index = dotIndex - (3 * i);
                if (index != 0){
                    sb.insert(index, ",");
                }
            }
        } else {
            for (int i = 1; i < len / 3 + 1; i++) { // 10000.000 10000
                int index = len - (3 * i);
                if (index != 0){
                    sb.insert(index, ",");
                }
            }
        }
        return sb.toString();
    }
}
