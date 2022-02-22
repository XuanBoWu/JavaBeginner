package com.wxb.beginner.chapter01;

/**
 * @author alex
 * 2021/12/21
 */
public class HanoiProblem {
    public static void main(String[] args) {
        T4 t4 = new T4();
        t4.hanoi(20, 'A', 'B', 'C');
    }
}

class T4 {
    public void hanoi(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + " -> " + c);
        } else {
            hanoi(num - 1, a, c, b);
            System.out.println(a + " -> " + c);
            hanoi(num - 1, b, a, c);
        }
    }

}
