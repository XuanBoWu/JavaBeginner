package com.wxb.beginner.hsp.exception;

/**
 * @author alex
 * @version 1.0
 */
public class Exception {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // 可能出现异常的代码段，使用try-catch
        try {
            int res = num1 / num2;
        } catch (java.lang.Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Program Running");
    }
}
