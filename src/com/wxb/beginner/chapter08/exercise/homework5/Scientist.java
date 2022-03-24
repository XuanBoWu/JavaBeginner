package com.wxb.beginner.chapter08.exercise.homework5;

public class Scientist extends Employee {
    private double bonus = 0;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("Scientist " + getName() + "'s is $" + (getSalary() * 12 + bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
