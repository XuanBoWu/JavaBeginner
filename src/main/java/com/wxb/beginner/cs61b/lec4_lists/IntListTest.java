package com.wxb.beginner.cs61b.lec4_lists;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec4_lists
 * @className IntListTest
 * @description TODO
 * @date 2023/7/24 16:05
 */

public class IntListTest {
    @Test
    public void testSize() {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(15, null);

        assertEquals(4, L.size());

    }

    @Test
    public void testiterativeSize() {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(15, null);

        assertEquals(4, L.iterativeSize());

    }
    @Test
    public void testGet() {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(13, null);

        assertEquals(5, L.get(1).first);
        assertEquals(10, L.get(2).first);
        assertEquals(15, L.get(3).first);
        assertEquals(13, L.get(4).first);

    }

    @Test
    public void testGetRecursion() {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(13, null);

        assertEquals(5, L.get_recursion(1).first);
        assertEquals(10, L.get_recursion(2).first);
        assertEquals(15, L.get_recursion(3).first);
        assertEquals(13, L.get_recursion(4).first);

    }

}
