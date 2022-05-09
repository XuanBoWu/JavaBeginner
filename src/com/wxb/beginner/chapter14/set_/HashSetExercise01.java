package com.wxb.beginner.chapter14.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author alex
 * @version 1.0
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Employee01("alex", 5000, new MyDate(1998, 1, 1)));
        hashSet.add(new Employee01("bob", 5000, new MyDate(1998, 1, 1)));
        hashSet.add(new Employee01("alex", 5000, new MyDate(1998, 1, 1)));

        System.out.println(hashSet);
    }
}

class Employee01 {
    private String name;
    private double sal;
    private MyDate birthDay;

    public Employee01(String name, double sal, MyDate birthDay) {
        this.name = name;
        this.sal = sal;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 that = (Employee01) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDay, that.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }
}
class MyDate {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}