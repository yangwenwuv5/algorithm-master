package com.leetcode.java.ling.DoublePointer.MoveZeroes283;

/**
 * @author lingQian
 * @date 2024/05/22 14:43
 **/
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int j = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            else {
                count++;
            }
        }
        if (count > 0) {
            int start = len - count;
            for (int i = start; i < len; i++) {
                nums[i] = 0;
            }
        }
    }
}
