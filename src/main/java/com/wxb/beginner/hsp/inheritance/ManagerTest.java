package com.wxb.beginner.hsp.inheritance;

/**
 * The book program list 5-1
 * This program demonstrates inheritance
 * @version 1.0 2022-02-19
 * @author alex
 */
public class ManagerTest {
    public static void main(String[] args) {
        //构造一个 Manager object
        Manager boos = new Manager("alex", 8000, 2021, 4, 12); //var关键字是Java10的新特性，编译器会自动识别需要的声明类型
        
        boos.setBonus(2000);
        
        Employee[] staff = new Employee[3];//职员数组

        //fill the staff array with Manager and Employee object | 用 Manager 和 Employee 对象填充人员数组

        staff[0] = boos;
        staff[1] = new Employee("Alice", 5000, 2020, 10 ,12);
        staff[2] = new Employee("Nico" ,6000, 2019, 9, 8);

        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }

}
