package com.wxb.beginner.hsp.small_change;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {




    public static void main(String[] args) {

        //
        boolean loop = true;
        String key;
        Scanner scanner = new Scanner(System.in);

        //1.零钱通明细
        String details = "===============零钱通明细===============";

        //2.零钱通明细
        double money;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //3.消费
        String note;

        // 绘制界面
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~零钱通~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t1. 零钱通明细 ");
            System.out.println("\t\t\t\t2. 收益入账");
            System.out.println("\t\t\t\t3. 消\t费");
            System.out.println("\t\t\t\t4. 退\t出");

            System.out.print("请选择（1～4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("收益金额应该大于 0 ");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该大于 0 ~ " +balance);
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();

                    balance -= money;
                    details += "\n" + note +"-消费\t\t" + "-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice;
                    while (true) {
                        System.out.println("确定退出？y/n");
                        choice = scanner.next();

                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    if ("y".equals(choice)) {
                        loop = false;
                        System.out.println("已退出。");
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择！");
            }



        } while (loop);



    }
}
