package com.wxb.beginner.nan.wrapper;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.wrapper
 * @className Exercise3
 * @description TODO
 * @date 2023/6/29 17:21
 */

/*
    练习三：包装类在集合中的应用
    在Java的集合中，不能直接放置基本数据类型，必须将基本类型封装成对应的包装类。请编写一个Java程序，创建一个ArrayList，然后往其中添加5个整数，并通过循环遍历ArrayList，打印出每个元素。
 */
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(12));
        arrayList.add(Integer.valueOf(15));
        arrayList.add(Integer.valueOf(16));
        arrayList.add(Integer.valueOf(18));
        arrayList.add(Integer.valueOf(28));

        for (Integer i : arrayList) {
            System.out.println(i);
        }

    }
}
