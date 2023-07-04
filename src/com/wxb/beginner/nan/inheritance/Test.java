package com.wxb.beginner.nan.inheritance;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.inheritance
 * @className Test
 * @description TODO
 * @date 2023/6/26 22:19
 */

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "张三", 18, 'M');
        Teacher teacher = new Teacher(2, "李四", 55, 'S');
        student.show();
        teacher.show();

    }
}
