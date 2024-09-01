package com.leetcode.java.ling.BinarySearch.FindMinimum0153;

/**
 * @author lingzhao
 * @date 2023/2/1
 * @link https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimum {
    public static int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int index = left + (right - left)/2;
            // 当其中间标志既小于数组right 又大于数组left 代表数组顺序没有进行变化 直接进行返回 示例 [11,13,14,15,17]
            if (nums[left] <= nums[index] && nums[index] <= nums[right]) {
                return nums[left];
            }
            // 当中间标志大于左边 也大于右边 则最小值一定会在右边 所以直接将left置为index 示例 [3,4,5,1,2] [3,4,5,6,7,1,2]
            if (nums[left] < nums[index] && nums[index] > nums[right]) {
                left = index;
            }
            // 当中间标志小于左边 也小于右边 则最小值一定在左边 所以直接将right置为index 示例 [3,4,5,-1,0,1,2]
            else if (nums[left] > nums[index] && nums[index] < nums[right]) {
                right = index;
            }
            // 如果只相差一个数字 则直接判断谁是最小值
            else if (right - left == 1) {
                if (nums[right] > nums[left]) {
                    return nums[left];
                }
                else {
                    return nums[right];
                }
            }
        }
        return nums[left];
    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int index = left + (right - left)/2;
            // 当中间标志小于右边 则最小值一定在左边 区间[left, index] 示例 [3,4,5,-1,0,1,2]
            if (nums[index] < nums[right]) {
                right = index;
            }
            else {
                left = index + 1;
            }
        }
        return nums[left];
    }
}
/*
nums = [3,4,5,1,2]
[3,4,5,6,7,1,2]
[3,4,5,-1,0,1,2]
[11,13,14,15,17]
 */