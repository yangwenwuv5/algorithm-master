package com.leetcode.java.ling.Array.Merge056;

import com.leetcode.java.ling.DoublePointer.MoveZeroes283.MoveZeroes;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void mergeTest() {
        int[][] nums1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected1 = {{1, 6}, {8, 10}, {15, 18}};
        int[][] nums2 = Merge.merge(nums1);
        assertArrayEquals(expected1, nums2);
    }
}