package com.wxb.beginner.hsp.chapter13.string_;

/**
 * @author alex
 * @version 1.0
 */
public class StringBase {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("123");
        char[] charArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',};
        String str3 = new String(charArray);
        System.out.println("a" + str1 + "C");
        System.out.println(str2);
        System.out.println(str3);

    }
}
