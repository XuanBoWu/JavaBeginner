package com.wxb.beginner.hsp.chapter01.homework;

/**
 * HomeWork01
 * 1. 编写类A01，定义方法max，实现求某个double数组的最大值，并返回
 *
 * @author alex
 *
 */
public class HomeWork01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] d = {22, 3, 12, 32, 1, 34, 12.9};
        System.out.println(a.max(d));
    }
}

class A01 {
    public Double max(double[] d) {
        double max = 0;
        if (d != null && d.length > 0) { //提高代码的健壮性
            for (int i = 0; i < d.length; i++) {
                if (d[i] > max) {
                    max = d[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }
}