package com.wxb.beginner.inheritance.equals;

import java.time.LocalDate;
import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    
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

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


    public boolean equals(Object otherObject) {
        // 检查地址是否相同，如果相同则一定为同一个对象，返回true
        if (this == otherObject) return true;

        // 检查对象是否是null，如果是则必须返回false
        if (otherObject == null) return false;

        // 检查对象是否是同一个类，如果不是，则返回false
        if (this.getClass() != otherObject.getClass()) return false;

        //现在我们知道了：对象是一个非null的Employee类（满足比较的前提）

        var other = (Employee) otherObject; // 因为已知了对象是Employee类，强制转换为显示的Employee类型

        // 将对象的字段逐一比较

        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
            
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }


    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
    
    
}
