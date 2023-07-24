package com.wxb.beginner.hsp.chapter02;


import java.util.Random;
import java.util.Scanner;

/**
 *  任务描述：
 *  编写一个猜数字游戏的程序，程序生成一个数字，用户来猜。
 *  程序后台随机生成一个0～100的数字，让用户猜一个数字输入到程序中，程序判断数字是否正确。
 *  如果正确，程序回会恭喜用户猜到了数字。如果不正确，程序会告诉用户猜的数字是比答案大还是小，一直到用户猜出数字为止。
 */
public class GuessNumber {
    public static void main(String[] args) {
        //首先生成一个0～100的随机数
        //调用Random类生成一个随机数
        int randomNumber = new Random().nextInt(100);
        //告知用户随机数已生成，并引导用户输入猜的数字
        System.out.println("随机数已经生成！");
        System.out.println("请输入您猜的数字：");
        //定义一个Scanner的实例接受用户输入的数字，赋值给userNumber
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();

        //当用户输入的值不等于随机数的时候，循环继续
        while(userNumber != randomNumber){
            //判断用户输入的值比随机数大还是小，并输出相应的提示语句
            if(userNumber>randomNumber){
                System.out.println("猜错了！ 你猜的数字比答案大");
            } else {
                System.out.println("猜错了！ 你猜的数字比答案小");
            }
            //用户猜错之后，让用户重新输入新的数字
            System.out.println("请输入您猜的数字：");
            userNumber = sc.nextInt();
        }
        //用户输入正确，跳出循环，输出相应提示语句，程序结束。
        System.out.println("恭喜你答对了！游戏结束。");

    }
}
