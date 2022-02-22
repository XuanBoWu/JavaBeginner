package com.wxb.beginner.chapter02;

/**
 *  任务描述：
 *  编写一个模拟商城库存清单的程序，打印出库存中每种商品的详细信息以及所有商品的汇总信息。
 *  每种商品的详细信息包括品牌型号、尺寸、价格、配置和库存数，所有商品的汇总信息包括总库存数和库存商品的总金额。
 *
 * @author WXB
 * @version 0.1
 */

public class StoreList {
    public static void main(String[] args) {
        //录入商品的信息
        //MacBook Air
        Goods macBookAir = new Goods("MacBook Air  ", 13.3, 6988.88,
                "i5处理器 4GB内存 128GB固态硬盘", 5);
        //Thinkpad笔记本电脑
        Goods thinkPad = new Goods("ThinkpadT450", 14.0, 5999.99,
                "i5处理器 4GB内存 500GB硬盘", 10);
        //华硕笔记本电脑
        Goods ASUS = new Goods("ASUS-FL5800  ", 15.6, 4999.5,
                "i7处理器 4GB内存 128GB固态硬盘", 18);
        //  打印清单的顶部，为固定的信息
        System.out.println("-------------------------------商城库存清单-------------------------------");
        System.out.println("品牌型号            尺寸      价格                   配置                   库存数");
        //调用Goods类的打印信息方法，打印商品信息
        macBookAir.printGoodsInfo();
        thinkPad.printGoodsInfo();
        ASUS.printGoodsInfo();
        System.out.println("------------------------------------------------------------------------");

        //统计总库存数、库存总金额
        int totalCount = macBookAir.count + thinkPad.count + ASUS.count;
        double totalMoney = macBookAir.price* macBookAir.count + thinkPad.count* thinkPad.price + ASUS.count* ASUS.price;
        System.out.println("总库存数：" + totalCount);
        System.out.println("库存商品总金额：" + totalMoney);
        
        //完成


    }
}

