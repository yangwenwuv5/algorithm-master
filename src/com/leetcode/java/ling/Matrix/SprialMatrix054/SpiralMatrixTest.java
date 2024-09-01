package com.leetcode.java.ling.Matrix.SprialMatrix054;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SpiralMatrixTest {

    @Test
    public void spiralOrderTest() {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] expectArr = {1,2,3,6,9,8,7,4,5};
        List<Integer> expect = new ArrayList<>();
        for (int value : expectArr) {
            expect.add(Integer.valueOf(value));
        }
        assertEquals(expect, SpiralMatrix.spiralOrder(matrix));
    }
}