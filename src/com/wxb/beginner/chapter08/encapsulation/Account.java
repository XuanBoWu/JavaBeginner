package com.wxb.beginner.chapter08.encapsulation;

/**
 * 创建程序，在其中定义两个类： Account和AccountTest类体会Java的封装性。
 * 1.Account类要求具有属性：姓名(长度为2位3位或4位)、余额(必须>20)、 密码（必须是六位)，如果不满足，则给出提示信息，并给默认值
 * 2.通过setXxx的方法给Account的属性赋值。
 * 3.在AccountTest中测试
 */
public class Account {
    private String name;
    private double balance;//余额
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度应在2至4，使用默认值张三");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，已使用默认值20");
            this.balance = 20;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为6位数字，已使用默认值888888");
            this.pwd = "888888";
        }
    }

    public void showAccountInfo() {
        System.out.println("名字：" + name + " 余额：" + balance + " 密码：" + pwd);
    }
}
