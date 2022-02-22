package com.wxb.beginner.chapter01;

public class Recursion01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        System.out.println(t1.factorial(5));
    }

}
class T1 {
    public void test(int n) {

        if (n > 2) {
            //递归调用
            test(n - 1);
        }
        System.out.println("n = " + n);
    }
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
