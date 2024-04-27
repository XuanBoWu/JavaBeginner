package com.wxb.beginner.cs61b.lec8_Inheritance;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec8_Inheritance
 * @className SLList
 * @description TODO
 * @date 2023/9/12 21:15
 */

public class SLList<T> {
    private static class Node<T> {
        public T item;
        public Node<T> next;
        public Node(T i, Node<T> n) {
            item = i;
            next = n;
        }
    }
    private Node<T> sentinel;
    private int size;

    public SLList() {
        sentinel = new Node<T>(null, null);
        size = 0;
    }
    public SLList(T n) {
        sentinel = new Node<T>(null, null);
        sentinel.next = new Node<T>(n, null);
        size = 1;
    }

    public SLList(T[] nums) {
        this();
        for (int i = 0; i < nums.length; i++) {
            this.addLast(nums[i]);
        }
    }

    /** Adds an item to the front of the list. */
    public void addFirst(T x) {
        this.sentinel.next = new Node(x, sentinel.next);
        size++;
    }

    /** Deletes the first element in your SLList */
    public void removeFirst() {
        sentinel.next = sentinel.next.next;
        size--;
    }

    public T removeLast() {
        Node<T> p = sentinel.next;
        for (int i = 0; i < size - 1; i++) {
            p = p.next;
        }
        T r = p.next.item;
        p.next = null;
        return r;
    }

    /** Retrieves the front item from the list. */
    public T getFirst() {
        return this.sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(T x) {
        /* Your Code Here! */
        Node<T> p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node<T>(x, null);
        size++;
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        return size;
    }

    public void print() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        Node<T> p = sentinel.next;
        if (p == null) {
            return null;
        }
        return SLList.class.getSimpleName() + "@" + super.hashCode() + ":[" + p.item + toString(p.next);
    }

    private String toString(Node<T> node) {
        if (node == null) {
            return "]";
        }
        return  " => " + node.item + toString(node.next);
    }
}
