package com.wxb.beginner.nan.javaclass;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.javaclass
 * @className Student
 * @description TODO
 * @date 2023/6/27 19:41
 */

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
