package com.wxb.beginner.hsp.chapter10.abstracts;

public class CommonEmployee extends Employee {

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Common Employee " + getName() + " is working...");
    }
}
