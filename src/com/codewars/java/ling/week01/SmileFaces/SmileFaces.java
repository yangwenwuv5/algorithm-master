package com.codewars.java.ling.week01.SmileFaces;

import java.util.List;

/**
 * @Date 2021/11/10
 * @author lingzhao
 * @Link https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
 */
public class SmileFaces {
    static String validSmilyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";

    public static int countSmileys(List<String> arr) {
        int n = 0;
        for(int i = 0; i <arr.size(); i++){
            if(validSmilyFaces.contains(arr.get(i))){
                n++;
            }
        }
        return n;
    }
}
