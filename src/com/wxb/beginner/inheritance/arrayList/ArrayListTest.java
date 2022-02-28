package com.wxb.beginner.inheritance.arrayList;

import java.util.ArrayList;

import com.wxb.beginner.inheritance.equals.*;


/**
 * This program demonstrates the ArrayList class.
 * @version 1.0 2022-02-28
 * @auhtor alex
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee object
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("alex", 7000, 2021, 4, 12));
        staff.add(new Employee("lin", 8000, 2022, 3, 12));
        staff.add(new Employee("Alice", 12000, 2018, 7, 12));
        
        // raise everyone's salary by 5%
        for (Employee e : staff) {
           e.raiseSalary(5); 
        }

        // print out information about all Employee object
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + " salary=" + e.getSalary() + " hireDay=" + e.getHireDay());
        }
    }
}
