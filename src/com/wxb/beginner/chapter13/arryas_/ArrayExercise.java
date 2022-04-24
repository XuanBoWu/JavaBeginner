package com.wxb.beginner.chapter13.arryas_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author alex
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦~",100);
        books[1] = new Book("金瓶梅~",90);
        books[2] = new Book("青年文摘~",5);
        books[3]= new Book("java从入门到放弃~",300);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book n1 = (Book) o1;
                Book n2 = (Book) o2;
                return (int) (n1.price - n2.price);
            }
        });

        for (Book b:
             books) {
            System.out.println(b.name + " " + b.price);
        }

        System.out.println("========================");

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book n1 = (Book) o1;
                Book n2 = (Book) o2;
                return (int) (n2.price - n1.price);
            }
        });

        for (Book b:
             books) {
            System.out.println(b.name + " " + b.price);
        }

        System.out.println("========================");


        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book n1 = (Book) o1;
                Book n2 = (Book) o2;
                return (int) (n1.name.length() - n2.name.length());
            }
        });

        for (Book b:
             books) {
            System.out.println(b.name + " " + b.price);
        }
    }
}

class Book {
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

}