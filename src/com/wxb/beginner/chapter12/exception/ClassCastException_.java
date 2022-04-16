package com.wxb.beginner.chapter12.exception;

/**
 * @author alex
 * @version 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B) b;
        C c = (C) b;
        System.out.println(c);
    }
}

class A{}
class B extends A {}
class C extends A {}