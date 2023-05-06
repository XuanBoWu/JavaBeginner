package com.wxb.beginner.hsp.inheritance.equals;

import java.util.Objects;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        // 使用超类equals方法验证是否相等，若为否，则返回false
        if (!super.equals(otherObject)) return false; 

        var other = (Manager) otherObject;

        // 超类equals返回true，则检查子类独有的字段
        return other.bonus == bonus;
    }

    public int hashCode() {
        // 超类的hash值和子类独有字段一起生成新的hash值
        return Objects.hash(super.hashCode(), bonus);
    }

    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }

}
