package com.wxb.beginner.chapter14.Homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author alex
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Car benz = new Car("奔驰", 250000);
        Car BMW = new Car("宝马", 230000);
        ArrayList carList = new ArrayList();
        ArrayList carList01 = new ArrayList();

        carList.add(benz);
        carList.add(BMW);

        carList01.addAll(carList);

        carList.remove(BMW);

        System.out.println(carList.contains(BMW));

        System.out.println(carList.size());

        System.out.println(carList.isEmpty());

        carList.clear();

        carList.addAll(carList01);

        System.out.println(carList.containsAll(carList01));

        carList.removeAll(carList01);


        //迭代器
        Iterator iterator = carList01.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("==============================");

        //增强for
        for (Object o : carList01) {
            System.out.println(o);
        }

    }
}
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
