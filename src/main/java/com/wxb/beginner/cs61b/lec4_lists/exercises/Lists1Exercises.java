package com.wxb.beginner.cs61b.lec4_lists.exercises;

import com.wxb.beginner.cs61b.lec4_lists.IntList;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec4_lists.exercises
 * @className Lists1Exercises
 * @description TODO
 * @date 2023/7/24 22:29
 */

public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList newList = null;
        int size = L.size();
        for (int i = size; i > 0; i--) {
            newList = L.get(i);
            newList = new IntList(newList.first + x, newList.rest);
        }
        L = newList;

        return L;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        int size = L.size();
        for (int i = size; i > 0; i--) {
            L.get(i).first = L.get(i).first + x;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));
    }
}