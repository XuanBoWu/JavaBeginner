package com.wxb.beginner.cs61b.lec5_sllist;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec5_sllist
 * @className SLListTest
 * @description TODO
 * @date 2023/7/25 15:47
 */

public class SLListTest {

    @Test
    public void sizeTest() {
        SLList slList = new SLList(3);
        slList.addFirst(2);
        slList.addFirst(2);
        slList.addFirst(2);
        slList.addFirst(2);
        slList.addFirst(2);
        slList.addFirst(2);
        slList.deleteFirst();

        assertEquals(6, slList.size());
    }

    @Test
    public void addArrayTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SLList slList = new SLList(array);

        assertEquals(9, slList.size());
    }
}
