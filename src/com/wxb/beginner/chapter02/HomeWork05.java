package com.wxb.beginner.chapter02;

public class HomeWork05 {

    public static void main(String[] args) {

        int[] arr = AboutArray.toGenerateArray(10);
        AboutArray.printArray(arr);

        System.out.print("倒序：");
        for (int i = 0; i < arr.length / 2; i++) {
            int buf = -1;
            buf = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 -i] = buf;
        }
        AboutArray.printArray(arr);

        int[] max = AboutArray.arrayGetMax(arr, true);
        System.out.println("最大值为：" + max[0] + ", 下标为：" + max[1] + "。");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8){
                System.out.println("有数字8，下标为：" + i + "。");
                break;
            } else if (i == arr.length - 1) {
                System.out.println("没有数字8。");
            }
        }

    }
}
