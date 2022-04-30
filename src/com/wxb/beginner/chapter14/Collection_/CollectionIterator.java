package com.wxb.beginner.chapter14.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author alex
 * @version 1.0
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("水浒传", "施耐庵", 12.5));
        col.add(new Book("红楼梦", "曹雪芹", 15.5));
        col.add(new Book("三国演义", "罗贯中", 10.5));

        for (Object book:
             col) {
            System.out.println(book.toString());
        }

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.toString());
        }


    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}