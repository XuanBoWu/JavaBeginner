package com.wxb.beginner.hsp.chapter01.homework;

import java.util.Random;

/**
 * Homework14
 * 14. 扩展题，学员自己做。
 *     有个人 Tom 设计他的成员变量。成员方法，可以电脑猜拳。
 *     电脑每次都会随机生成0，1，2 0表示 石头1 表示剪刀2表示布 并要可以显示 Tom的输赢次数（清单)
 */
public class HomeWork14 {
    public static void main(String[] args) {
        A05 tom = new A05("Tom");
        A05 c = new A05("电脑");

        tom.print(c);
        tom.print(c);
        tom.print(c);
    }
}
class A05 {
    String name;
    int results;

    public A05(String name) {
        this.name = name;
    }

    public void random() {
        this.results = new Random().nextInt(3);
    }

    public int judge(A05 a) {
        this.random();
        a.random();
        if (this.results < a.results && a.results-this.results != 2 && this.results != a.results) {
            return 1;
        } else if (a.results - this.results == 2) {
            return -1;
        } else {
            return 0;
        }
    }
    public void print(A05 a) {
        int judgeNum = judge(a);
        switch (judgeNum) {
            case -1: System.out.println(this.name + "输了");
                break;
            case 0 : System.out.println(this.name + "平了");
                break;
            case 1 : System.out.println(this.name + "赢了");
                break;
        }
    }
}