package com.leetcode.java.ling.DoublePointer.ThreeSum015;

import java.util.*;

/**
 * @author lingQian
 * @date 2024/05/24 20:21
 * @link https://leetcode.cn/problems/3sum/?envType=study-plan-v2&envId=top-100-liked
 **/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] > 0) return lists;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int curr = nums[i];
            int L = i + 1, R = len - 1;
            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if(tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L < R && nums[L+1] == nums[L]) L++;
                    while (L < R && nums[R-1] == nums[R]) R--;
                    L++;
                    R--;
                } else if(tmp < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return lists;
    }
}
