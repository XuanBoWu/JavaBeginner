package com.wxb.beginner.hsp.chapter10.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02 {
    private int n1 = 10;
    private int n2 = 21;
    private void m2(){
        System.out.println("Outer02 m2");
    }
    public void m1() {
        class Inner02 {// 只作用在定义的方法或代码块中
            int n2 = 30;
            public void f1() {
                // 可以直接访问外部类的私有方法
                System.out.println("n1 = " + n1);
                m2();
                // 外部类和局部内部类成员重名
                System.out.println(n2); // 30
                System.out.println(Outer02.this.n2); // 21
            }
        }
        // 在作用域中，访问局部内部类
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}