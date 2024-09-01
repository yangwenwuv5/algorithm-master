package com.leetcode.java.ling.DoublePointer.ContainerWithMostWater011;

import com.leetcode.java.ling.BinarySearch.FindMinimumⅡ0154.FindMinimumⅡ;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, ContainerWithMostWater.maxArea(height));
    }
}