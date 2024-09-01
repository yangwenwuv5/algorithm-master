package com.codewars.java.ling.week02.HumanReadableTime;

/**
 * @date 2021/11/18
 * @author lingzhao
 * @link https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int s = seconds % 60;
        int m = seconds / 60 % 60;
        int h = seconds / 3600 % 100;
        return String.format("%02d:%02d:%02d",h,m,s);
    }
}
