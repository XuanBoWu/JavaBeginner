package com.wxb.beginner.cs61b.lec3_testing.disc02;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec3_testing.disc02
 * @className FibonacciProblem
 * @description TODO
 * @date 2023/7/20 21:16
 */

public class FibonacciProblem {
    public static void main(String[] args) {
        int n = 40;
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        long timeElapsed;

        for (int i = 0; i < n; i++) {
            System.out.println(findFibonacciNum_1(i));
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("耗时:" + timeElapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.println(findFibonacciNum_2(i));
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("耗时:" + timeElapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            System.out.println(findFibonacciNum_3(i, 0, 0, 1));
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("耗时:" + timeElapsed);
    }

    /**
     * 最简单常规的递归求斐波那契数的方法，效率很低
     * @param n
     * @return 第N个斐波那契数
     */
    public static int findFibonacciNum_1(int n) {
        if (n <= 1) {
            return n;
        } else{
            return findFibonacciNum_1(n - 1) + findFibonacciNum_1(n - 2);
        }
    }

    /**
     * 不使用递归，使用循环来做，效率高一些
     * @param n
     * @return 第N个斐波那契数
     */
    public static int findFibonacciNum_2(int n) {
        int n0 = 0, n1 = 1;
        int count = 2;
        int fib = 0;
        if (n <= 1) {
            return n;
        }
        while (count <= n) {
            fib = n0 + n1;
            n0 = n1;
            n1 = fib;
            count++;
        }
        return fib;
    }

    /**
     * 使用递归，但是优化了性能
     * @param n 指定的n
     * @param k 递归结束条件
     * @param f0 n - 2
     * @param f1 n - 1
     * @return
     */
    public static int findFibonacciNum_3(int n, int k, int f0, int f1) {
        if (n == k) {
            return f0;
        } else {
            return findFibonacciNum_3(n, k + 1, f1, f0 + f1);
        }
    }
}
