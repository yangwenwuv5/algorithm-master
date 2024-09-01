package com.leetcode.java.ling.Hash.LongestConsecutiveSequence128;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lingQian
 * @date 2024/05/22 09:36
 */
public class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutive() {
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive2(new int[] { 100, 4, 200, 1, 3, 2 }));
    }
}