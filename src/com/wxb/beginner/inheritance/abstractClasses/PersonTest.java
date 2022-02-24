package com.wxb.beginner.inheritance.abstractClasses;

/**
 * The book program list 5-4.
 *  This program demonstrates abstract classes.
 * @version 1.0 2022-02-21
 * @author alex
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects | 用 Student 和 Employee 对象填充 people 数组
        people[0] = new Employee("alex", 8000, 2021, 4, 12);
        people[1] = new Student("Cline", "English");

        // print out names and descriptions of all Person objects
        for (Person p:
             people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
