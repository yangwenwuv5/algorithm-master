package com.leetcode.java.ling.BinarySearch.FindMinimumⅡ0154;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author lingzhao
 * @date 2023/2/2
 */
public class FindMinimumⅡTest extends FindMinimumⅡ {
    @Test
    public void test() {
        //assertEquals(1, FindMinimumⅡ.findMin(new int[]{1,3,5}));
        //assertEquals(0, FindMinimumⅡ.findMin(new int[]{2,2,2,0,1}));
        //assertEquals(1, FindMinimumⅡ.search(new int[]{1,3},3));
        //assertEquals(4, FindMinimumⅡ.search(new int[]{4,5,6,7,0,1,2},0));
        assertEquals(0, FindMinimumⅡ.search(new int[]{3,5,1},3));
    }
}