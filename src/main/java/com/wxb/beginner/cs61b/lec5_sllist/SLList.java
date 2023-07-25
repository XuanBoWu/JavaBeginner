package com.wxb.beginner.cs61b.lec5_sllist;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec5_sllist
 * @className SLList
 * @description TODO
 * @date 2023/7/25 14:45
 */

public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode first;
    private int size;
    public SLList(int n) {
        first = new IntNode(n, null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        this.first = new IntNode(x, first);
        size++;
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return this.first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size++;
    }

}
