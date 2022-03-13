package com.wxb.beginner.chapter08.poly.polyParameter;

public class Worker extends Employee{

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Worker " + getName() + " is working");
    }

    @Override
    public double getSalary() { //没有其他收入
        return super.getSalary();
    }
}
