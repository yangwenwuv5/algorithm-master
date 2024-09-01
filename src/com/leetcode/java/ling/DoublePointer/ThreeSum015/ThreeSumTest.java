package com.leetcode.java.ling.DoublePointer.ThreeSum015;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = ThreeSum.threeSum(nums1);
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(-1, -1, 2));
        expected1.add(Arrays.asList(-1, 0, 1));
        assertEquals(expected1.size(), result1.size());
        assertTrue(result1.containsAll(expected1) && expected1.containsAll(result1));
    }
}