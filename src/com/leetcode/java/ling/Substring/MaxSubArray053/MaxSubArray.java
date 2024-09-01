package com.leetcode.java.ling.Substring.MaxSubArray053;

/**
 * @author lingQian
 * @date 2024/05/28 22:18
 * @link https://leetcode.cn/problems/maximum-subarray/?envType=study-plan-v2&envId=top-100-liked
 **/
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int maxSubArray2(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
