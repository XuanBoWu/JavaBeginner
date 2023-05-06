package com.wxb.beginner.hsp.chapter13.arryas_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author alex
 * @version 1.0
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers = { 123, 32, 3};

        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // o1 是需要排序的数组
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers));


    }
}
