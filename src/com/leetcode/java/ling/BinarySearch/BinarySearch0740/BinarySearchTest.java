package com.leetcode.java.ling.BinarySearch.BinarySearch0740;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @author lingzhao
 * @date 2023/1/13
 */
public class BinarySearchTest extends BinarySearch {
    @Test
    public void test() {
        //System.out.println("Fixed Tests accum");
        assertEquals(-1, BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(-1, BinarySearch.search2(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}