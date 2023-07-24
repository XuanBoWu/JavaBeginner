package com.wxb.beginner.hsp.chapter01.homework;

/**
 * Homework06
 * 6. 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
 *    定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Cale c1 = new Cale(13, 89);
        Cale c2 = new Cale(89, 0);

        c1.print();
        System.out.println("=========================");
        c2.print();
    }
}
class Cale {
    double num1;
    double num2;

    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }
    public double diff() {
        return num1 - num2;
    }
    public double quad() {
        return num1 * num2;
    }
    public Double quot() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("除数为零！");
            return null;
        }
    }
    public void print() {
        System.out.println("和：" + sum());
        System.out.println("差：" + diff());
        System.out.println("积：" + quad());
        System.out.println("商：" + quot());
    }
}