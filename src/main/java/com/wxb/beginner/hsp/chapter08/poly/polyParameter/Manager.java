package com.wxb.beginner.hsp.chapter08.poly.polyParameter;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("Manager " + getName() + " is under management");
    }

    @Override
    public double getSalary() { //基本工资加奖金
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
