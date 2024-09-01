package com.leetcode.java.ling.Substring.SubarraySum560;

import java.lang.reflect.Array;

/**
 * @author lingQian
 * @date 2024/05/27 20:42
 * @link https://leetcode.cn/problems/subarray-sum-equals-k/?envType=study-plan-v2&envId=top-100-liked
 **/
public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
