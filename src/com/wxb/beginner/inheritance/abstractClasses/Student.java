package com.wxb.beginner.inheritance.abstractClasses;

/**
 * The book program list 5-7.
 * The Student class inheritance the Person class and implements abstract methods of the super class.
 * @version 1.0 2022-02-21
 * @author alex
 */
public class Student extends Person{
    private String major; //专业

    /**
     * @param name the student's name
     * @param major the student's major
     */

    public Student(String name, String major) {
        // pass name to superclass constructor | 将name传递给超类的构造函数
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
