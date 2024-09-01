package com.codewars.java.ling.week01.FindOdd;

/**
 * @Date 2021/11/9
 * @author lingzhao
 * @link https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
 */
public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        for(int i = 0; i < a.length; i++){
            odd ^= a[i];
        }
        return odd;
    }
}
