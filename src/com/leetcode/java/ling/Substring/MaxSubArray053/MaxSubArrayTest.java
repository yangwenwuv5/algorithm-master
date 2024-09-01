package com.leetcode.java.ling.Substring.MaxSubArray053;

import com.leetcode.java.ling.Substring.SubarraySum560.SubarraySum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
//        assertEquals(6, MaxSubArray.maxSubArray(nums1));
        assertEquals(6, MaxSubArray.maxSubArray2(nums1));
    }
}