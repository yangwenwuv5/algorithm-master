package com.leetcode.java.ling.DoublePointer.ContainerWithMostWater011;

/**
 * @link: https://leetcode.cn/problems/container-with-most-water/?envType=study-plan-v2&envId=top-100-liked
 * @author 翎钱
 * @date 2024/5/23 20:31
 * @version 1.0
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int width = Math.min(height[i], height[j]);
            int length = j - i;
            maxArea = Math.max(width * length, maxArea);
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return maxArea;
    }
}
