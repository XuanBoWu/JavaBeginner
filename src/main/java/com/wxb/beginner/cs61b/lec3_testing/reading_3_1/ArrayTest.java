package com.wxb.beginner.cs61b.lec3_testing.reading_3_1;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec3_testing.reading_3_1
 * @className ArrayTest
 * @description TODO
 * @date 2023/7/24 11:34
 */

public class ArrayTest {

    @Test
    public void arrayTest() {
        int[][] a = {{1}, {2}, {3}, {1, 2, 3}};
        int[][] b = {{1}, {2}, {3}, {1, 2, 3}};

        assertArrayEquals(a, b);
    }






}
