package com.codewars.java.ling.week01.FindOutlier;

import java.util.Arrays;

/**
 * @date 2021/11/11
 * @author lingzhao
 * @link https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
 */
public class FindOutlier {
    static int find(int[] integers){
        int[] evens = Arrays.stream(integers).filter(i -> i % 2 == 0 ).toArray();
        int[] odds = Arrays.stream(integers).filter(i -> i % 2 != 0).toArray();
        return evens.length == 1 ? evens[0] : odds[0];
    }
}
