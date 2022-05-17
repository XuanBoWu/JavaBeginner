package com.wxb.beginner.chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author alex
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("1", new Employee("alex", 5000, "1"));
        map.put("2", new Employee("bob", 20000, "2"));
        map.put("3", new Employee("jack", 19000, "3"));
        Employee jack = new Employee("jack", 19000, "3");

        map.get("1").getClass();
        for (Object key : map.keySet()) {
            Employee employee = (Employee) map.get(key);
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }

        // EntrySet
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }


    }
}

class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}