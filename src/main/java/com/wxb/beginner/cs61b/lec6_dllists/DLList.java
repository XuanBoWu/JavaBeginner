package com.wxb.beginner.cs61b.lec6_dllists;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec6_dllists
 * @className General_DLList
 * @description TODO
 * @date 2023/8/18 15:26
 */

public class DLList<T> {

    private static class Node<T> {
        private T item;
        private Node previous;
        private Node next;

        public Node(T item, Node previous, Node next) {
            this.item = item;
            this.previous = previous;
            this.next = next;
        }
    }

    private int size;
    private Node<T> sentinel;

    public DLList() {
        sentinel = new Node<T>(null, sentinel, sentinel);
        sentinel.next = sentinel;
        sentinel.previous = sentinel;

        size = 0;
    }

    public DLList(T item) {
        sentinel = new Node<T>(null, sentinel, sentinel);
        sentinel.next = sentinel;
        sentinel.previous = sentinel;

        sentinel.next = new Node(item, sentinel, sentinel);
        sentinel.previous = sentinel.next;
        size = 1;
    }

    public DLList(T[] arrays) {
        sentinel = new Node<T>(null, sentinel, sentinel);
        sentinel.next = sentinel;
        sentinel.previous = sentinel;

        for (T item:
             arrays) {
            addLast(item);
        }
    }

    public void addFirst(T item) {
        Node p = sentinel.next;
        p = new Node(item, sentinel, p);
        p.next.previous = p;
        sentinel.next = p;
        size++;
    }

    public void addLast(T item) {
        Node p = sentinel.previous;
        p = new Node(item, p, sentinel);
        p.previous.next = p;
        sentinel.previous = p;

        size++;
    }

    public void deleteFirst() {
        if (size > 0) {
            sentinel.next = sentinel.next.next;
            size--;
        }
    }

    public T getFirst() {
        return (T) this.sentinel.next.item;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node p = sentinel.next;
        if (p == sentinel) {
            return null;
        }
        return DLList.class.getSimpleName() + "@" + super.hashCode() + ":[" + p.item + toString(p.next);
    }

    private String toString(Node node) {
        if (node == sentinel) {
            return "]";
        }
        return " => " + node.item + toString(node.next);
    }
}
