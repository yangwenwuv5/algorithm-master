package com.leetcode.java.ling.Substring.SubarraySum560;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumTest {
    @Test
    public void subarraySum() {
        int[] nums1 = {1, -1, 0};
        assertEquals(3, SubarraySum.subarraySum(nums1, 0));
        int[] nums2 = {1,2,1,2,1};
//        assertEquals(4, SubarraySum.subarraySum(nums2, 3));
    }
}