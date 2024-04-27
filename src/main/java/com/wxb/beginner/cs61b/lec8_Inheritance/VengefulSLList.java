package com.wxb.beginner.cs61b.lec8_Inheritance;


/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec8_Inheritance
 * @className VengefulSLList
 * @description TODO
 * @date 2023/9/12 21:10
 */

public class VengefulSLList<T> extends SLList<T> {
    SLList<T> deletedItems;

    public VengefulSLList() {
        deletedItems = new SLList<T>();
    }

    public void printLostItems() {
        deletedItems.print();
    }

    @Override
    public T removeLast() {
        T r = super.removeLast();
        deletedItems.addLast(r);
        return r;
    }
}
