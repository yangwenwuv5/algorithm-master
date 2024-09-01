package com.codewars.java.kazaky.week02.solution;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/16/19:44
 * @Description:
 */
public class solution {
    public static boolean solution(String str, String ending) {
        char[] strArr = str.toCharArray();
        char[] endingArr = ending.toCharArray();
        int len = str.length()-ending.length();
        if(len<0) {return false;}
        for(int i = 0;i<ending.length();i++){
            if(strArr[i+len]!=endingArr[i]){
                return false;
            }
        }
        return true;
    }
}
