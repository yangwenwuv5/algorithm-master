package com.leetcode.java.ling.BinarySearch.BinarySearch0740;

/**
 * @author lingzhao
 * @date 2023/1/13
 * @link https://leetcode.cn/problems/binary-search/https://leetcode.cn/problems/binary-search/
 */
public class BinarySearch {
    // 第一种方法 内部循环
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // 代表target值在[left, right]之间
            int index = left + (right - left)/2;
            if (target == nums[index]) {
                return index;
            }
            if (target > nums[index]) {
                // 代表target值在[index+1, right]之间
                left = index + 1;
            }
            if (target < nums[index]) {
                // 代表target值在[left, index-1]之间
                right = index - 1;
            }
        }
        return -1;
    }
    // 第二种方法 递归
    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // 代表target值在[left, right]之间
            int index = left + (right - left)/2;
            if (target == nums[index]) {
                return index;
            }
            if (target > nums[index]) {
                // 代表target值在[index+1, right]之间
                left = index + 1;
            }
            if (target < nums[index]) {
                // 代表target值在[left, index-1]之间
                right = index - 1;
            }
        }
        return -1;
    }

    public static int diGui(int[] nums, int target, int left, int right) {
        int index = left + (right - left)/2;
        if (left <= right) {
            if (target == nums[index]) {
                return index;
            }
            if (target > nums[index]) {
                // 代表target值在[index+1, right]之间
                left = index + 1;
            }
            if (target < nums[index]) {
                // 代表target值在[left, index-1]之间
                right = index - 1;
            }
            return diGui(nums, target, left, right);
        }
        return -1;
    }
}
