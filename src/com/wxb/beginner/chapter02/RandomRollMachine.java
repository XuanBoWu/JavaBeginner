package com.wxb.beginner.chapter02;


import java.util.Random;
import java.util.Scanner;

/**
 * 任务描述
 * 编写一个可以随机点名全班某一个同学名字的程序
 * 具备三个功能
 * 1、存储全班同学的姓名
 * 2、总览全班同学的姓名
 * 3、随机点取其中一人的名字
 *
 * @author alex
 * @since 0.1
 */
public class RandomRollMachine {
    //让用户输入学生姓名存入数组中
    public static void addStudentName(String[] students) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生的姓名：");
            students[i] = sc.next();
        }
    }

    public static void printStudentsName(String[] students) {
        //遍历数组，得到每个学生的姓名
        for (int i = 0; i < students.length; i++) {
            String name = students[i];
            //打印学生姓名
            System.out.println("第" + (i+1) + "个学生姓名：" + name);
        }
    }

    public static void randomStudentName(String[] students) {

        int randomNumber = new Random().nextInt(students.length);

        System.out.println("随机点名：" + students[randomNumber] + "！");

    }
    public static void main(String[] args) {
        //定义存储学生姓名的容器
        String[] students = new String[3];
        //往定义好的容器里面添加学生姓名
        addStudentName(students);
        //遍历打印学生姓名
        printStudentsName(students);
        //随机点名
        randomStudentName(students);
    }

}
