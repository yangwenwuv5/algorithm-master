package com.leetcode.java.ling.Matrix.SetZeroes073;

import com.leetcode.java.ling.Array.Merge056.Merge;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetZeroesTest {

    @Test
    public void setZeroesTest() {
        int[][] nums1 = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int[][] expected1 = {{0,0,0,0}, {0,4,5,0}, {0,3,1,0}};
        SetZeroes.setZeroes(nums1);
        assertArrayEquals(expected1, nums1);
    }
}