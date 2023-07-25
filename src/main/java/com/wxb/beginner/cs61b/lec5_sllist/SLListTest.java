package com.wxb.beginner.cs61b.lec5_sllist;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals(7, slList.size());
    }
}
