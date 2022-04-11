package com.wxb.beginner.chapter10.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String name = "bob";
    public void f1() {
        class B {
            final String NAME = "alex";

            public void show() {
                System.out.println(A.this.name);
            }
        }
        new B().show();
    }
}