package com.codewars.java.ling.week02.Solution;

/**
 * @date 2021/11/15
 * @author lingzhao
 * @link https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java
 */
public class Solution {
    public static boolean validParentheses(String parens) {
        char[]  chars = parens.toCharArray();
        int flag = 0;
        int len = parens.length();
        for(int i = 0; i < len; i++){
            if(chars[i] == '('){
                flag++;
            }
            if(chars[i] == ')'){
                if(flag == 0){
                    return false;
                }
                flag--;
            }
        }
        return flag == 0;
    }
}
