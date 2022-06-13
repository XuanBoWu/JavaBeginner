package com.wxb.beginner.chapter15.generic.exercise;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Employee alex = new Employee("alex", 6000, new MyDate(1990, 1, 1));
        Employee bob = new Employee("bob", 7000, new MyDate(1992, 10, 2));
        Employee bob2 = new Employee("bob", 7000, new MyDate(1992, 10, 1));
        Employee alice = new Employee("alice", 5000, new MyDate(1995, 1, 15));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(alex);
        employees.add(bob);
        employees.add(bob2);
        employees.add(alice);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o1.getName())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(MyDate otherDate) {
        int num;
        if (this.year != otherDate.year) {
            num = this.year - otherDate.year;
        } else if (this.month != otherDate.month) {
            num = this.month - otherDate.month;
        } else {
            num = this.day - otherDate.day;
        }
        return num;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}