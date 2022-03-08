package com.wxb.beginner.chapter08.poly;
/**
 * 这个程序演示 使用多态的情况
 * @version 1.0 2022-03-08
 * @author alex
 */
public class Master_Poly {
    private String name;

    public Master_Poly(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }

}
