package com.leetcode.java.ling.Array.ProductExceptSelf238;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf() {
        int[] num1 = {1,2,3,4};
        int[] num2 = {24,12,8,6};
        int[] expected1 = ProductExceptSelf.productExceptSelf(num1);
        assertArrayEquals(expected1, num2);
    }
}