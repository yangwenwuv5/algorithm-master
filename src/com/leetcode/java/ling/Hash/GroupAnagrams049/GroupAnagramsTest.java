package com.leetcode.java.ling.Hash.GroupAnagrams049;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author lingQian
 * @date 2024/05/21 17:38
 */
public class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = GroupAnagrams.groupAnagrams(strs);

        // 将结果转换为数组
        String[][] resultArray = new String[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<String> sublist = result.get(i);
            resultArray[i] = sublist.toArray(new String[0]);
            Arrays.sort(resultArray[i]);  // 排序以确保一致性
        }

        // 对预期结果进行排序以确保一致性
        String[][] expectedArray = {{"bat"}, {"nat", "tan"}, {"ate", "eat", "tea"}};
        for (String[] arr : expectedArray) {
            Arrays.sort(arr);
        }

        // 对整个数组进行排序
        Arrays.sort(resultArray, Comparator.comparing(Arrays::toString));
        Arrays.sort(expectedArray, Comparator.comparing(Arrays::toString));

        // 使用 assertArrayEquals 进行比较
        assertArrayEquals(expectedArray, resultArray);
    }
}