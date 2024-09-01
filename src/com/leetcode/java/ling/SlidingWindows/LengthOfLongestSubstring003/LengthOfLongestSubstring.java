package com.leetcode.java.ling.SlidingWindows.LengthOfLongestSubstring003;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lingQian
 * @date 2024/05/25 20:10
 * @link
 **/
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(chars[i])) {
                left = Math.max(left, map.get(chars[i]) + 1);
            }
            max = Math.max(max, i - left + 1);
            map.put(chars[i], i);
        }
        return max;
    }

    public static int lengthOfLongestSubstring3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(chars[j])) {
                    break;
                }
                map.put(chars[j], ++count);
            }
            max = Math.max(max, count);
            map.clear();
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int right = -1;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (right + 1 < len && !set.contains(s.charAt(right + 1))) {
                set.add(s.charAt(right + 1));
                right++;
            }
            max = Math.max(max, right + 1 -i);
        }
        return max;
    }
}
