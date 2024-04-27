package com.wxb.beginner.cs61b.lec7_alists.DIY;

/** Array based list.
 *  @author Josh Hug
 */

public class AList<T> {
    /**
     * Creates an empty list.
     */
    private T[] items;
    private int size;

//    private static double RFACTOR = 1.4;

    public AList() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * Adjust the size of the underlying array.
     */
    private void resize(int targetSize) {
        T[] a = (T[]) new Object[targetSize];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(T x) {
        if (size == items.length) {
            resize((int) (size * 1.5));
        }
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public T getLast() {
        return items[size - 1];
    }

    /** Gets the ith item in the list (0 is the front). */
    public T get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public T removeLast() {
        T x = getLast();
        items[size - 1] = null;
        size--;
        return x;
    }

} 