package com.wxb.beginner.cs61b.lec6_dllists;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec6_dllists
 * @className DLListTest
 * @description TODO
 * @date 2023/8/18 17:04
 */

public class DLListTest {
    @Test
    public void sizeTest() {
        DLList<String> stringDLList = new DLList<>();
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.addFirst("嘿");
        stringDLList.deleteFirst();

        assertEquals(8, stringDLList.getSize());

    }

    @Test
    public void addArraysTest() {
        String[] strArrays = {"1", "2", "3", "4", "5", "6"};
        DLList<String> stringDLList = new DLList<>(strArrays);
        stringDLList.toString();
    }

    @Test
    public void addLastTest() {
        DLList<String> stringDLList = new DLList<>("123");
        stringDLList.addLast("a");
        stringDLList.addLast("b");
        stringDLList.addLast("c");

        stringDLList.deleteFirst();
        assertEquals(4, stringDLList.getSize());
    }
}
