package com.wxb.beginner.chapter01.homework;

/**
 * Homework04
 * 4. 编写类A03，实现数组的复制功能copyArr， 输入旧数组，返回一个新数组，元素和旧数组一样
 */
public class HomeWork04 {
    public static void main(String[] args) {
        A03 a = new A03();
        int[] arr = {1, 2, 3, 4, 5};
        a.printArr(arr);
        int[] newArr = a.copyArr(arr);
        a.printArr(newArr);

    }
}
class A03 {
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] copyArr(int[] arr) {
          int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}