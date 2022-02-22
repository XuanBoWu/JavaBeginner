package com.wxb.beginner.chapter02;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        int[] arr = {10, 12, 45, 90};


        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要插入的值：");
        int insertNum = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (insertNum < arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = arr.length;
        }

        System.out.println(index);

        int[] arrNew = new int[arr.length + 1];
        for (int j = 0; j < arr.length; j++) {
            if(j < index){
                arrNew[j] = arr [j];
            } else {
                arrNew[j+1] = arr[j];
            }
        }
        arrNew[index] = insertNum;
        arr = arrNew;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
