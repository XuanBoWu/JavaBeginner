package com.wxb.beginner.review;/**
 * @author alex
 * @version 1.0
 */public class Item {
     private String name;
     private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Item item1 = new Item("血瓶", 50);
        Item item2 = new Item("草鞋", 300);
        Item item3 = new Item("长剑", 350);
    }

}
