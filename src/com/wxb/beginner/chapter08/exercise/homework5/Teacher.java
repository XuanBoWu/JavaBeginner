package com.wxb.beginner.chapter08.exercise.homework5;

public class Teacher extends Employee {
    private double classDay;
    private double classSal;

    public Teacher(String name, double salary, double classSal) {
        super(name, salary);
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.println("Teacher " + getName() + "'s is $" + (getSalary() * 12 + classDay * classSal));
    }

    public double getClassDay() {
        return classDay;
    }

    public void setClassDay(double classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
