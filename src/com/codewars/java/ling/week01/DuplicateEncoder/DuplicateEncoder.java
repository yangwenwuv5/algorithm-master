package com.codewars.java.ling.week01.DuplicateEncoder;

/**
 * @date 2021/11/8
 * @author lingzhao
 * @link https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
 */
public class DuplicateEncoder {

    static String encode(String word){
        char[] ch = word.toCharArray();
        word = "";
        for(int i = 0; i < ch.length; i++){
            int flag = 0;
            for(int j = 0; j < ch.length; j++){
                if(i == j){
                    continue;
                }
                if(String.valueOf(ch[i]).equalsIgnoreCase(String.valueOf(ch[j]))){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                word += '(';
            }else {
                word += ')';
            }
        }
        return word;
    }

}
