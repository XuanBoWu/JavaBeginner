package com.wxb.beginner.nan.wrapper;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.wrapper
 * @className Exercise2
 * @description TODO
 * @date 2023/6/29 17:17
 */

/*
    练习二：自动装箱和拆箱
    在Java中，编译器可以自动将基本数据类型转换为对应的包装类对象，这就是自动装箱，反之称为自动拆箱。请编写一个Java程序，进行整数的自动装箱和自动拆箱操作，并注释说明发生了什么。
 */
public class Exercise2 {
    public static void main(String[] args) {
        int i = 10;
        // 这里发生了自动装箱
        Integer a = i;
        // 自动拆箱
        i = a + 10;
    }
}
