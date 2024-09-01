package com.leetcode.java.ling.SlidingWindows.LengthOfLongestSubstring003;


import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {
    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
        assertEquals(5, LengthOfLongestSubstring.lengthOfLongestSubstring("tmmzuxt"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring2("pwwkew"));
        assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring2("au"));
    }
}