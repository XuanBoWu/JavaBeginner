package com.wxb.beginner.chapter01.homework;

/**
 * Homework02
 * 2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引， 如果找不到，返回-1.
 *
 * @author alex
 *
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String[] strs = { "1", "2", "3", "4", "5", "6"};
        A02 a = new A02();
        System.out.println(a.find(strs, "5"));
        System.out.println(a.find(strs, "9"));
    }
}
class A02 {
    public int find(String[] strs, String s) {
        int index = -1;
        for (int i = 0; i < strs.length; i++) {
            if (s.equals(strs[i])){
                index = i;
            }
        }
        return index;
    }
}
