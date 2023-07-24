package com.wxb.beginner.cs61b.lec3_testing.reading_3_1;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec3_testing.reading_3_1
 * @className TestSort
 * @description TODO
 * @date 2023/7/21 11:59
 */

public class TestSort {
    /** Sort类的sort方法的测试。*/
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        for (int i = 0; i < input.length; i += 1) {
            if (!input[i].equals(expected[i])) {
                System.out.println("在位置 " + i + " 处不匹配，期望值: " + expected + "，实际值: " + input[i] + "。");
                break;
            }
        }
    }

    public static void main(String[] args) {
        testSort();
    }
}
