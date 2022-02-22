package com.wxb.beginner.chapter01;

import java.util.Scanner;

public class ArrayCapacity {
    public static void main(String[] args) {
        //扩容数组
        Scanner sc = new Scanner(System.in);

        //初始数组
        int[] arr = {1, 2, 3, 4};
        System.out.println("数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        while (true) {
            System.out.print("请输入要插入的值:");
            int n = sc.nextInt();

            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arrNew.length - 1] = n;

            arr = arrNew;
            System.out.print("现在数组为：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("请问是否要继续插入值？（Y/N）");
            String ch = sc.next();

            if (ch.equals("N")) {
                break;
            }
        }


    }
}
