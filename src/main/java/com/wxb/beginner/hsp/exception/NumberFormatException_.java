package com.wxb.beginner.hsp.exception;

/**
 * @author alex
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        try {
            String name = "ABC";
            int num = Integer.parseInt(name);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("始终执行这段代码");
        }
    }
}
