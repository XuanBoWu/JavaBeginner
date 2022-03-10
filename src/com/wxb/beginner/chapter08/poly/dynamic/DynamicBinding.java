package com.wxb.beginner.chapter08.poly.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.sum());
        System.out.println(a.sum1());

    }
}


class A { //super class
    private int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    private int i = 20;

//    @Override
//    public int sum() {
//        return i + 20;
//    }

//    @Override
//    public int sum1() {
//        return getI() + 20;
//    }

    @Override
    public int getI() {
        return i;
    }
}