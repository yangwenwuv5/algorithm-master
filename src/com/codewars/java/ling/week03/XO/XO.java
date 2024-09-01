package com.codewars.java.ling.week03.XO;

import java.util.HashMap;
import java.util.Map;

/**
 * @data 2021/11/22
 * @author lingzhao
 * @link https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
 */
public class XO {
    public static boolean getXO(String str) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            String s = String.valueOf(str.charAt(i)).toUpperCase();
            if(map.containsKey(s)|| map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        if(!map.containsKey("o") && !map.containsKey("x")){
            return true;
        }
        if(!map.containsKey("O") || !map.containsKey("X")){
            return false;
        }
        return map.get("O").equals(map.get("X"));
    }
    // Stream流实现
//     return str.toUpperCase().chars().filter(ch -> ch == 'X').count() == str.toUpperCase().chars().filter(ch -> ch == 'O').count();
}
