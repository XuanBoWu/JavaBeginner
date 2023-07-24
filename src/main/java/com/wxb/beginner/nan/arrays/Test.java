package com.wxb.beginner.nan.arrays;

import java.util.Arrays;

/**
 * @author alex
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] array1 = {21, 322, 12, 54, 22, 56};
        int[] array2 = {2344, 32, 19, 54, 22, 56};
        int[] array3 = {2344, 32, 19, 54, 22, 56};

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array3, array2));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        Arrays.fill(array1, 1);
        System.out.println(Arrays.toString(array1));
        int[] copyOf = Arrays.copyOf(array2, array2.length + 2);
        System.out.println(Arrays.toString(copyOf));
        int index = Arrays.binarySearch(array3, 32); //binarySearch 必须用于有序数组
        System.out.println(index);


        // 二维数组
        int[][] array4 = new int[3][3];
        int[] i1 = {1, 2, 3};
        int[] i2 = {4, 5, 6};
        int[] i3 = {7, 8, 9};

        array4[0] = i1;
        array4[1] = i2;
        array4[2] = i3;

        System.out.println(Arrays.toString(array4));

        //简便定义
        int[][] array5 = {{1, 2, 3}, {4, 5, 6, 9}, {7, 8, 9}}; //子数列长度可以不一样
        
        //输出格式 1
        String str = "";
        for (int i = 0; i < array5.length; i++) {
            str += Arrays.toString(array5[i]);
        }
        System.out.println(str);

        //输出格式 2 遍历
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                System.out.println(array5[i][j]);
            }
        }

        int[][] array6 = new int[3][6];
        fillArray(array6);
        for (int i = 0; i < array6.length; i++) {
            str += Arrays.toString(array6[i]) + "\n";
        }
        System.out.println(str);
    }
    // eg
    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
    }

}
