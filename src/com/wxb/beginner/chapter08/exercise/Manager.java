package com.wxb.beginner.chapter08.exercise;

public class Manager extends Employee {
    private double bonus = 0;

    public Manager(String name, double daySal, double workingDays, double grade) {
        super(name, daySal, workingDays, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("Manager " + getName() + "'s salary is $" + (bonus + getDaySal() * getWorkingDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
