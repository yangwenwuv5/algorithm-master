package com.codewars.java.kazaky.week03.FindOdd;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/23/21:03
 * @Description:
 */
public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        for (Integer aa : a) {
            odd = odd ^ aa;
        }
        return odd;
    }
}
