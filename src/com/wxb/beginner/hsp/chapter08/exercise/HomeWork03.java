package com.wxb.beginner.hsp.chapter08.exercise;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob", 43, "讲师", 8000);
        Professor professor = new Professor("Bob", 43, "教授", 12000);
        System.out.println(teacher.introduce());
        System.out.println(professor.introduce());
    }
}


