package com.leetcode.java.ling.Array.Merge056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lingQian
 * @date 2024/06/03 20:36
 * @link https://leetcode.cn/problems/merge-intervals/?envType=study-plan-v2&envId=top-100-liked
 **/
public class Merge {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int len = result.size();
            if (len > 0 && intervals[i][0] <= result.get(len - 1)[1]) {
                result.get(len - 1)[1] = Math.max(intervals[i][1], result.get(len - 1)[1]);
            }
            else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
