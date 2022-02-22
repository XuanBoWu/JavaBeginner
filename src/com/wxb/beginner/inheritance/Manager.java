package com.wxb.beginner.inheritance;

/**
 * The book program list 5-3
 * This is the Manager class, which inherits from the Employee class
 * @version 1.0 2022-02-20
 * @author alex
 */
public class Manager extends Employee {
    private double bonus;//增加奖金属性

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public double getSalary() {
        double baseSalary = super.getSalary(); //基本工资
        return baseSalary + bonus; //经理的总收入为基本工资加上奖金
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
