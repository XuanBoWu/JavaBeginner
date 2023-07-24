package com.wxb.beginner.cs61b.hw0;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.hw0
 * @className FindMaxNum
 * @description TODO
 * @date 2023/7/7 12:55
 */

public class FindMaxValue {
    /** Exercise 2: Returns the maximum value from m. */
    public static int max(int[] m) {
        int max = m[0];
        for (int i = 1; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
