package com.wxb.beginner.chapter02;

public class Goods {
    //商品属性
    String brand;
    double size;
    double price;
    String config;
    int count;
    //商品信息打印方法
    public void printGoodsInfo(){
        System.out.println(brand+"\t   "+size+"\t\t"+price+"\t\t"+config+"\t\t"+count);
    }
    //无参构造方法
    public Goods(){
    }
    //构造方法初始化
    public Goods(String brand, double size, double price, String config, int count) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.config = config;
        this.count = count;
    }
}
