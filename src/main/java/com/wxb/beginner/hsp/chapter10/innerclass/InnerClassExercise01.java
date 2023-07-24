package com.wxb.beginner.hsp.chapter10.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("AAAAAA");
            }
        });

    }
    public static void f1(IL il) {
        il.show();
    }
}


interface IL {
    void show();
}