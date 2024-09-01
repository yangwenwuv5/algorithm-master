package com.codewars.java.ling.week01.Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2021/11/9
 * @author lingzhao
 * @link https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
 */
public class Solution {
    public static boolean validatePin(String pin) {
        char[] chars = pin.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        for(Character ch : chars){
            if(ch >= '0' && ch <= '9'){
                map.put('a',map.get('a')+1);
            }
        }
        if((map.get('a') == 4 || map.get('a') == 6) && (chars.length == 4 || chars.length == 6)){
            return true;
        }
        return false;
    }
}
