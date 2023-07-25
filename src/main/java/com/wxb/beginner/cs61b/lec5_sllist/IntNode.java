package com.wxb.beginner.cs61b.lec5_sllist;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec5_sllist
 * @className IntNode
 * @description TODO
 * @date 2023/7/25 14:43
 */

public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
        this.item = i;
        this.next = n;
    }
}
