package com.leetcode.java.ling.Hash.LongestConsecutiveSequence128;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author lingQian
 * @date 2024/05/22 09:24
 **/
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
            else if (nums[i] == nums[i - 1]) {
                continue;
            }
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public static int longestConsecutive2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int length = left + right + 1;
                max = Math.max(max, length);
                map.put(num, length);
                map.put(num - left, length);
                map.put(num + right, length);
            }
        }
        return max;
    }
}
