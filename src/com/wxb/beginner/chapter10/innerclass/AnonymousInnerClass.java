package com.wxb.beginner.chapter10.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

    }
}

class Outer04 {

    IA ia = new IA() { // 基于接口实现
        @Override
        public void cry() {
            System.out.println("在匿名内部类里输出");
        }
    };

    Father father = new Father("jack") { // 基于类继承
        @Override
        public void test() {
            System.out.println("在匿名内部类里输出");
        }
    };


}

interface IA {
    public void cry();
}



class Father {
    private String name;
    public Father(String naem) {
        this.name = naem;
    }
    public void test() {
    }
}