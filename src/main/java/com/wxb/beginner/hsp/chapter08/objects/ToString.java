package com.wxb.beginner.hsp.chapter08.objects;

public class ToString {
    public static void main(String[] args) {
        Monster jinx = new Monster("Jinx", "shooting", 13333);

        System.out.println(jinx.toString());
        System.out.println(jinx);

    }
}


class Monster {
    String name;
    String job;
    double salary;

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
}
