package com.wxb.beginner.hsp.chapter01.homework;

/**
 * Homework13
 * 13. 将对象作为参数传递给方法。
 * 题目要求：
 * (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea0方 法返回圆的面积。
 * (2)定义一个类PassObject，在类中定义一个方法printAreas0)，该方法的定义如下： public void printAreas(Circle c， int times) //方法签名
 * (3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。 例如，times为5，则输出半径1，2， 3， 4， 5， 以及对应的圆面积。
 * (4)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果 如图所示
 */
public class HomeWork13 {
    public static void main(String[] args) {
        PassObject po = new PassObject();
        Circle01 c = new Circle01();
        po.printAreas(c, 5);
    }
}
class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.println("Radius  Area");
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.cArea());
        }
    }
}
class Circle01 {
    double radius;
    Circle01(){}

    Circle01(double radius) { //构造器
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