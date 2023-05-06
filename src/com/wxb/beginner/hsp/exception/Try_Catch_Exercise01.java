package com.wxb.beginner.hsp.exception;

import java.util.Scanner;

/**
 * @author alex
 * @version 1.0
 */
public class Try_Catch_Exercise01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int integer = 0;
        do {

            System.out.println("please input a integer：");
            String integerStr = scanner.next();
            try {
                integer = Integer.parseInt(integerStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! must input integer");
            }

        } while(loop);
        System.out.println(integer);
    }
}


