package com.wxb.beginner.inheritance;

public class test01 {
    public static void main(String[] args) {
        System.out.println("123");
        System.out.println("321");
        var e = new Employee("alex", 6000, 2021, 4, 12);
        System.out.println(e.hashCode());
        System.out.println(e.getName());
        System.out.println(e.getName());
        System.out.println(e.getName());
        System.out.println(Employee.class);

    }
}
