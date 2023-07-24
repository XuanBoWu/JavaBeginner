package com.wxb.beginner.hsp.chapter08.exercise;

public class Employee {
    private String name;
    private double daySal;
    private double workingDays;
    private double grade;

    public Employee(String name, double daySal, double workingDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workingDays = workingDays;
        this.grade = grade;
    }

    public void printSalary() {
        System.out.println(name + "'s salary is $" + daySal * workingDays * grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public double getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(double workingDays) {
        this.workingDays = workingDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
