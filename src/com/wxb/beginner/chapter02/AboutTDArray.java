package com.wxb.beginner.chapter02;

public class AboutTDArray {
    public static void main(String[] args) {
        //几种定义二维数组的方式
        int[][] arr0 = new int[3][4];
        int[][] arr1 = new int[3][];
        int[][] arr2 = {{ 1,2},{ 2,3},{ 8,7}};

        //定义二维数组记录3个小组的销售数据
        int[][] arr = new int[3][];
        arr[0] = new int[] { 11, 12};
        arr[1] = new int[] { 21, 22, 23};
        arr[2] = new int[] { 31, 32, 33, 34};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int groupSum = 0;
            //在每个小组内遍历
            for (int j = 0; j < arr[i].length; j++) {
                groupSum += arr[i][j];
            }
            sum += groupSum;
            System.out.println("第" + (i+1) + "小组的销售为：" + groupSum + "万元。");
        }

        System.out.println("总销售额为：" + sum + "万元。");





    }
}
