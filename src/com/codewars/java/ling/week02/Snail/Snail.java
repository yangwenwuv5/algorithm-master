package com.codewars.java.ling.week02.Snail;

/**
 * @date 2021/11/17
 * @author lingzhao
 * @link https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
 */
public class Snail {
    public static int[] snail(int[][] array) {

        if (array[0].length == 0) {
            return array[0];
        }
        int n = array.length;
        int[] result = new int[n*n];
        int index=0;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j < n-i; j++) {
                result[index++] = array[i][j];
            }
            for (int j = i+1; j < n-i; j++) {
                result[index++] = array[j][n-i-1];
            }
            for (int j = i+1; j < n-i; j++) {
                result[index++] = array[n-i-1][n-j-1];
            }
            for (int j = i+1; j < n-i-1; j++) {
                result[index++] = array[n-j-1][i];
            }
        }
        if (n%2 != 0) {
            result[index++] = array[n/2][n/2];
        }
        return result;
    }
}
