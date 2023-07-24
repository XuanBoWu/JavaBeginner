package com.wxb.beginner.hsp.small_change.oop;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用OOP编程
 *
 */
public class SmallChangeSysOOP {

    //
    boolean loop = true;
    String key = "";
    Scanner scanner = new Scanner(System.in);

    //1.零钱通明细
    String details = "===============零钱通明细===============";

    //2.零钱通明细
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //3.消费
    String note = null;

    public void mianMenu() {
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
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择！");
            }

        } while(loop);
    }
    // 零钱通明细
    public void details() {
        System.out.println(details);
    }
    // 收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益金额应该大于 0 ");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    //消费
    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该大于 0 ~ " +balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();

        balance -= money;
        details += "\n" + note +"-消费\t\t" + "-" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    // 退出
    public void exit() {
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
    }


}
