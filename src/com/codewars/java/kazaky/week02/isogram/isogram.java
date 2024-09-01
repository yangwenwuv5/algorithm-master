package com.codewars.java.kazaky.week02.isogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/17/20:15
 * @Description:
 */
public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
        Set set = new HashSet();
        char[] strArr = str.toCharArray();
        for(Character arr : strArr){
            if(set.contains(arr) | set.contains((char)(arr-32)) | set.contains((char)(arr+32))){
                return false;
            } else{
                set.add(arr);
            }
        }
        return true;
    }
}