package com.wxb.beginner.hsp.inheritance.abstractClasses;
/**
 * The book program list 5-6.
 * The Employee class inherits the Person class and implements the abstract methods of the super class.
 * @version 1.0 2022-02-21
 * @author alex
 */

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() { //实现父类的抽象方法
        return String.format("an employee with a salary of $%.2f", salary);//格式化输出语句，格式化语法同C
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
