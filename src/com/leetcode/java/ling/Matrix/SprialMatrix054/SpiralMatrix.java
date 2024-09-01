package com.leetcode.java.ling.Matrix.SprialMatrix054;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingQian
 * @date 2024/06/12 21:05
 * @link https://leetcode.cn/problems/spiral-matrix/?envType=study-plan-v2&envId=top-100-liked
 **/
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            for (int i = up + 1; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            if (left < right && up < down) {
                for (int i = right - 1; i > left; i--) {
                    result.add(matrix[down][i]);
                }
                for (int i = down; i > up; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
