package com.wxb.beginner.cs61b.hw0;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.hw0
 * @className BreakContinue
 * @description TODO
 * @date 2023/7/7 13:21
 */

/*
编写一个函数`windowPosSum(int[] a, int n)`，将`a[i]`替换为`a[i]`到`a[i + n]`的元素之和，但仅当`a[i]`的值为正数时。
如果没有足够的值，因为我们到达了数组的末尾，我们只计算我们拥有的值的和。

例如，假设我们使用数组`a = {1, 2, -3, 4, 5, 4}`和`n = 3`调用`windowPosSum`。在这种情况下，我们将：

将a[0]替换为a[0] + a[1] + a[2] + a[3]。
将a[1]替换为a[1] + a[2] + a[3] + a[4]。
不对a[2]进行任何操作，因为它是负数。
将a[3]替换为a[3] + a[4] + a[5]。
将a[4]替换为a[4] + a[5]。
对a[5]不进行任何操作，因为a[5]之后没有值。
因此，调用windowPosSum后的结果将是{4, 8, -3, 13, 9, 4}。
 */
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = i; j < n + i; j++) {
                if (j + 1  >= a.length) {
                    break;
                }
                a[i] = a[i] + a[j + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
