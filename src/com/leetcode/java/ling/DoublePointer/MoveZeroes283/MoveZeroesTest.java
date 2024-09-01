package com.leetcode.java.ling.DoublePointer.MoveZeroes283;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author lingQian
 * @date 2024/05/22 15:32
 */
public class MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        MoveZeroes.moveZeroes(nums1);
        assertArrayEquals(expected1, nums1);
    }
}