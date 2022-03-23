package com.wxb.beginner.chapter08.exercise;

public class HomeWork01 {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", 22, "tester");
        Person p2 = new Person("Bob", 20, "tester");
        Person p3 = new Person("Alice", 43, "tester");

        Person[] arr = {p1, p2, p3};

        new HomeWork01().sort(arr);

        for (Person p: arr) {
            System.out.println(p);
        }


    }

    public void sort(Person[] arr) {
        // 冒泡排序
        Person tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j].getAge() < arr[j+1].getAge()){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}