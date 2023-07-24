package com.wxb.beginner.hsp.chapter08.exercise.homework13;

/**
 * HomeWork13
 * 案例题目描述：
 * (1)做一个Student类，Student类有名称 (name)，性别(sex)，年龄(age)，学号（stuid)，做合理封装，通过构造器在创建对象时将4个属性赋值。
 * (2)写一个Teacher类，Teacher类有名称(name)，性别（sex），年龄(age}，工龄(work_age)，做合理封装，通过构造器在创建对象时将4个属性赋值。
 * (3)抽取一个父类Person类，将共同属性和方法放到Person类
 * (4)学生需要有学习的方法 (study），在方法里写生“我承诺，我会好好学习。”
 * (5)教师需要有教学的方法(teach），在方法里写上“我承诺，我会认真教学。”。
 * (6)学生和教师都有玩的方法 (play)，学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回 “xx爱玩足球”和“xx爱玩象棋”（其中xx分别
 *    代表学生和老师的姓名）。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
 * (7)定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，
 * (8) 定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
 */
public class HomeWork13 {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Student("Alex", "M", 23, 170000010);
        arr[1] = new Student("Bob", "M", 22, 170000020);
        arr[2] = new Teacher("Alic", "M", 43, 10);
        arr[3] = new Teacher("Jack", "M", 54, 12);

        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.sort(arr);

        for (Person p:
             arr) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }


    }

    public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof  Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("null");
        }
    }

    public void sort(Person[] p) {
        Person tmp;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j+1].getAge()) {
                    tmp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tmp;
                }
            }
        }
    }


}
