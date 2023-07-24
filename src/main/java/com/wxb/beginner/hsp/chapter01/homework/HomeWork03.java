package com.wxb.beginner.hsp.chapter01.homework;

/**
 * Homework03
 * 3. 编写类Book，定义方法updatePrice， 实现更改某本书的价格，具体：如果价格 >150，
 *    则更改为150，如果价格>100，更改为100，否则不变
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Book b1 = new Book(180);
        Book b2 = new Book(120);
        Book b3 = new Book(80);

        System.out.println(b1.price);
        System.out.println(b2.price);
        System.out.println(b3.price);
        System.out.println("======================");

        b1.updatePrice();
        b2.updatePrice();
        b3.updatePrice();

        System.out.println(b1.price);
        System.out.println(b2.price);
        System.out.println(b3.price);
    }
}
class Book {
    double price;

    Book(double price) {
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (price > 100) {
            this.price = 100;
        } else {
            return;
        }
    }
}