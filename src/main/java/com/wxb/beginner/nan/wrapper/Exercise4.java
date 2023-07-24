package com.wxb.beginner.nan.wrapper;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.wrapper
 * @className Exercise4
 * @description TODO
 * @date 2023/6/29 17:28
 */

/*
    练习四：包装类的缓存机制
    Integer类有一个内置的对象缓存数组，默认缓存-128到127之间的整数对象。请编写一个Java程序，
    使对象缓存机制明显（如创建两个范围内的Integer对象并用“ == ”比较，再创建两个超出范围的Integer对象进行同样的比较，观察结果并解释原因）。
 */
public class Exercise4 {
    public static void main(String[] args) {
        Integer i1 = 120;
        Integer i2 = 120;
        Integer a1 = 300;
        Integer a2 = 300;

        System.out.println(i1 == i2); //结果为true，因为大小在-128和127之间，在缓存之内可以使用 == 比较
        System.out.println(a1 == a2); //结果为false，因为大小超出了缓存范围，两个对象之间不能使用 == 比较。而应该使用equals比较
    }
}
