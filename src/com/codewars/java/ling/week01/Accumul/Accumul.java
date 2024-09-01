package com.codewars.java.ling.week01.Accumul;

/**
 * @date 2021/11/9
 * @author lingzhao
 * @link https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
 */
public class Accumul {
    public static String accum(String s) {
        String str = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            str += String.valueOf(chars[i]).toUpperCase();
            for(int j = 0; j < i; j++){
                str += String.valueOf(chars[i]).toLowerCase();
            }
            str += '-';
        }
        return str.substring(0,str.length()-1);
    }
}
