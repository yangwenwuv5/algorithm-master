package com.leetcode.java.ling.BinarySearch.FindMinimumⅡ0154;

/**
 * @author lingzhao
 * @date 2023/2/2
 * @link https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class FindMinimumⅡ {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int index = left + (right - left)/2;
            // 当中间与右边相等 则右边减一 则下一轮搜索空间为 [left, right-1]
            if (nums[index] == nums[right]) {
                right--;
            }
            // 如果中间值小于右边 则最小值必然在最左边 下一轮搜索空间为[left,index]
            else if (nums[index] < nums[right]){
                right = index;
            }
            // 如果中间值小于右边 则最小值必然在最左边 下一轮搜索空间为[left+1, right]
            else {
                left++;
            }
        }
        return nums[left];
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // 向上取整
            int index = left + (right - left + 1)/2;
            if (nums[index] < nums[right]) {
                // [index, right]
                if (nums[index] <= target && target <= nums[right]) {
                    left = index;
                }
                // [left, index-1]
                else {
                    right = index - 1;
                }
            }
            else {
                // 此时left到index-1是有序的
                if (nums[left] <= target && target <= nums[index-1]) {
                    right = index - 1;
                }
                else {
                    left = index;
                }
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}