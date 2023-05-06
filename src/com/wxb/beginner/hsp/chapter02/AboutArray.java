package com.wxb.beginner.hsp.chapter02;

import java.util.Random;

public class AboutArray {
    public static void main(String[] args) {
        //数组的定义
        int[] x = new int[100];

        //遍历初始化前的默认值 0
        for (int i = 0; i < x.length; i++) {
            //每行打印10个数字
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(x[i] + " ");
        }
        System.out.println();
        //遍历初始化数组
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }
        //遍历输出打印数组
        for (int i = 0; i < x.length; i++) {
            //每行打印10个数字
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(x[i] + " ");
        }
        System.out.println("数组X的长度是：" + x.length);

        int[] arr = toGenerateArray(15);
        System.out.print("生成一个数组：" );
        printArray(arr);
        System.out.println();
        System.out.print("排序后：");
        arraySort(arr);
        printArray(arr);
    }

    //遍历打印数组
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //每行打印20个数字
            if (i % 20 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //生成n个元素的数组，元素值随机
    public static int[] toGenerateArray(int n) {
        int[] arr = new int[n];
        //遍历数组并给数组元素赋随机值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }
    // 找出数组中最大的项并打印出来
    public static int arrayGetMax(int[] arr){
        //假设第一项是最大值
        int Max = arr[0];

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int[] arrayGetMax(int[] arr, boolean bool){
        //假设第一项是最大值
        int Max = arr[0];
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
                index = i;
            }
        }
        int max[] = {Max, index};
        return max;
    }

    public static void arraySort(int[] arr) {
        //遍历数组，使用冒泡排序

        //定义临时变量
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //依次两两比较大小关系
            for (int j = 0; j < arr.length - i - 1; j++) {
                //判断前后元素大小关系，如果前面的元素大则交换前后两个元素
                if (arr[j] > arr[j+1]){
                    //交换前后元素
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }



}
