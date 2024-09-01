package com.leetcode.java.ling.Array.Rotate189;

/**
 * @author lingQian
 * @date 2024/06/04 20:29
 * @link https://leetcode.cn/problems/rotate-array/?envType=study-plan-v2&envId=top-100-liked
 **/
public class Rotate {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            result[count++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            result[count++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}
