package com.wxb.beginner.chapter10.abstracts;

public class Abstract01 {
    public static void main(String[] args) {
        CommonEmployee bob = new CommonEmployee("Bob", 123, 5000);
        Manager alex = new Manager("Alex", 11, 14000, 2000);

        bob.work();
        alex.work();

    }
}
