package com.wxb.beginner.chapter01;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        //输入芝麻信用分，根据分数大小输出信用等级
        int score = 0;//信用分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的芝麻信用分：");

        score = sc.nextInt();
        if (score >= 0) {
            System.out.print("您的信用等级为：");
            if (score < 60) {
                System.out.print("不及格");
            } else if (score < 81) {
                System.out.print("一般");
            } else if (score < 100) {
                System.out.print("优秀");
            } else {
                System.out.print("极好");
            }
        } else {
            System.out.println("您的输入有误！");
        }

    }
}
