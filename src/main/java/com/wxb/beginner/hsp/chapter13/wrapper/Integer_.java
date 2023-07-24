package com.wxb.beginner.hsp.chapter13.wrapper;

/**
 * @author alex
 * @version 1.0
 */
public class Integer_ {
    public static void main(String[] args) {
        Integer n1 = new Integer(1);
        Integer n2 = new Integer(1);

        System.out.println(n1 == n2);

        Integer n3 = 1;
        Integer n4 = 1;
        System.out.println(n3 == n4);

        Integer n5 = 128;
        Integer n6 = 128;
        System.out.println(n5 == n6);

        String s1 = "180";
        String s2 = "180";
        System.out.println(s1 == s2);
        int n = "123".length();
        System.out.println(n);
        System.out.println(n5.hashCode());
    }
}