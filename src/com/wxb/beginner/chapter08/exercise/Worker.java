package com.wxb.beginner.chapter08.exercise;

public class Worker extends Employee {



    public Worker(String name, double daySal, double workingDays, double grade) {
        super(name, daySal, workingDays, grade);
    }

    @Override
    public void printSalary() {
        System.out.println("Worker " + getName() + "'s salary is $" + getDaySal() * getWorkingDays() * getGrade());
    }
}
