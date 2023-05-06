package com.wxb.beginner.hsp.chapter08.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("小明", 2, "123456");
        account.showAccountInfo();
        Account account1 = new Account("111小明", 21, "1213456");
        account1.showAccountInfo();

    }
}
