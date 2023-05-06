package com.wxb.beginner.hsp.chapter08.poly.objectPloy;

public class ObjectPloy {
    public static void main(String[] args) {
        //Animal 是编译类型，Dog 是运行类型
        Animal animal = new Dog();

        //因为运行时，执行到该行时，animal运行类型是Dog，所以cry就是Dog的cry
        animal.cry(); //dog cry

        //animal 编译类型 Animal，运行类型就是 Cat
        animal = new Cat();
        animal.cry(); // cat cry


    }
}
