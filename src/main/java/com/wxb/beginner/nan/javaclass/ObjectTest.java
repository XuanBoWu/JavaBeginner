package com.wxb.beginner.nan.javaclass;

import java.util.Objects;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.javaclass
 * @className ObjectTest
 * @description TODO
 * @date 2023/6/27 19:38
 */

public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();
        int i = objectTest.hashCode();
        String string = objectTest.toString();
        System.out.println(i);
        System.out.println(string);
        Person person = new Person(null, 1);
//        int i1 = person.hashCode();
        Object o = null;
        System.out.println(Objects.hashCode(o));
    }
}
