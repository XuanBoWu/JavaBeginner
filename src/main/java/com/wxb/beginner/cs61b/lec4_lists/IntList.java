package com.wxb.beginner.cs61b.lec4_lists;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec4_lists
 * @className IntList
 * @description TODO
 * @date 2023/7/24 15:54
 */

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return this.rest.size() + 1;
    }

    public int iterativeSize() {
        IntList p = this.rest;
        int count = 1;
        while (p != null) {
            count++;
            p = p.rest;
        }
        return count;
    }

    public IntList get(int i) {
        if (i > size()) {
            System.out.println("The requested index is greater than the length of the list!");
            return null;
        }
        int count = i;
        IntList targetNode = this;
        while (count > 1) {
            targetNode = targetNode.rest;
            count--;
        }
        return targetNode;
    }

    public IntList get_recursion(int i) {
        if (i > size()) {
            System.out.println("The requested index is greater than the length of the list!");
            return null;
        }

        if (i == 1) {
            return this;
        }
        return this.rest.get_recursion(i - 1);
    }
}
