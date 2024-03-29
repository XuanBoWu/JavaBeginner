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
    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(5, null);
        size = 0;
    }
    public SLList(int n) {
        sentinel = new IntNode(5, null);
        sentinel.next = new IntNode(n, null);
        size = 1;
    }

    public SLList(int[] nums) {
        this();
        for (int i = 0; i < nums.length; i++) {
            this.addLast(nums[i]);
        }
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        this.sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    /** Deletes the first element in your SLList */
    public void deleteFirst() {
        sentinel.next = sentinel.next.next;
        size--;
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return this.sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size++;
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        return size;
    }
    @Override
    public String toString() {
        IntNode p = sentinel.next;
        if (p == null) {
            return null;
        }
        return SLList.class.getSimpleName() + "@" + super.hashCode() + ":[" + p.item + toString(p.next);
    }

    private String toString(IntNode node) {
        if (node == null) {
            return "]";
        }
        return  " => " + node.item + toString(node.next);
    }

}
