package com.wxb.beginner.nan.interfaces;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.interfaces
 * @className Test
 * @description TODO
 * @date 2023/7/4 16:12
 */

public class Test implements MyInterface, MyInterface2{
    public static void main(String[] args) {
        System.out.println(MyInterface.ID);
    }

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }
}
