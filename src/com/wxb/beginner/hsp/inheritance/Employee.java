package com.wxb.beginner.hsp.inheritance;

import java.time.LocalDate;

/**
 * The book program list 5-2
 * This an employee class
 * @version 1.0 2022-02-19
 * @author alex
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay; //入职日期

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){ //按百分比增加工资
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
