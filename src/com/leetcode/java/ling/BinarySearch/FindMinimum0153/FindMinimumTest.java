package com.leetcode.java.ling.BinarySearch.FindMinimum0153;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author lingzhao
 * @date 2023/2/1
 */
public class FindMinimumTest extends FindMinimum {
    @Test
    public void test() {
        assertEquals(1, FindMinimum.findMin(new int[]{3,4,5,1,2}));
        assertEquals(1, FindMinimum.findMin(new int[]{3,4,5,6,7,1,2}));
        assertEquals(-1, FindMinimum.findMin(new int[]{3,4,5,-1,0,1,2}));
        assertEquals(11, FindMinimum.findMin(new int[]{11,13,14,15,17}));
    }
}