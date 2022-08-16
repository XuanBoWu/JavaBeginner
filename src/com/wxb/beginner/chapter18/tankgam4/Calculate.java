package com.wxb.beginner.chapter18.tankgam4;

import java.util.Scanner;

/**
 * @author alex
 * @version 1.0
 */
public class Calculate {
    public static void main(String[] args) {
        double originPrice1;
        double currPrice1;
        double originPrice2;
        double currPrice2;
        double bargainAll;
        double bargain1;
        double bargain2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一件商品的原始价格：");
        originPrice1 = scanner.nextDouble();
        System.out.println("请输入第二件商品的原始价格：");
        originPrice2 = scanner.nextDouble();
        double tmp;
        if (originPrice1 > originPrice2) {
            tmp = originPrice2;

        } else {
            tmp = originPrice1;
        }
        bargainAll = tmp / 2;
        bargain1 = bargainAll * originPrice1 / (originPrice1 + originPrice2);
        currPrice1 = originPrice1 - bargain1;

        bargain2 = bargainAll * originPrice2 / (originPrice1 + originPrice2);
        currPrice2 = originPrice2 - bargain2;

        System.out.println("商品\t\t牌价\t\t优惠\t\t金额");
//        System.out.println("商品一\t" + originPrice1 + "\t" + bargain1 + "\t" + currPrice1);
        System.out.printf("商品一\t%.2f\t%.2f\t%.2f", originPrice1, bargain1, currPrice1);
        System.out.println();
//        System.out.println("商品二\t" + originPrice2 + "\t" + bargain2 + "\t" + currPrice2);
        System.out.printf("商品二\t%.2f\t%.2f\t%.2f", originPrice2, bargain2, currPrice2);


    }
}
