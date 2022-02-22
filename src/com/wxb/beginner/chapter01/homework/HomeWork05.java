package com.wxb.beginner.chapter01.homework;

/**
 * Homework05
 * 5.定义一个圆类Circle， 定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Circle c = new Circle(13);
        System.out.println(c.cPerimeter());
        System.out.println(c.cArea());
    }
}
class Circle {
    double radius;

    Circle(double radius) { //构造器
        this.radius = radius;
    }

    public double cPerimeter() {
        double perimeter = 2 * Math.PI* radius;
        return perimeter;
    }
    public double cArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}