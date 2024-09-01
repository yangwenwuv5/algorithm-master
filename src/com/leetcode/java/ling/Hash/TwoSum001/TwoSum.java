package com.leetcode.java.ling.Hash.TwoSum001;

import java.util.HashMap;

/**
 * @author lingzhao
 * @date 2024/5/20
 * @link https://leetcode.cn/problems/two-sum/?envType=study-plan-v2&envId=top-100-liked
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    result[0] = i;
                    result[1] = j;

                }
            }
        }
        return result;
    }

    /**
     * @description: double for loop solution
     * @param nums
     * @param target
     * @return: int[]
     * @author lingzhao
     * @date: 2024/5/21 17:21
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}