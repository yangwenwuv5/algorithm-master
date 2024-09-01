package com.codewars.java.ling.week01.SpinWords;

/**
 * @date:2021/11/8
 * @author:lingzhao
 * @link https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
 */
public class SpinWords {

    public String spinWords(String sentence) {
        String[] sb = sentence.split(" ");
        String result = "";
        for(int i = 0; i < sb.length; i++){
            if(sb[i].length() >= 5){
                result += reviced(sb[i]);
            }else {
                result += sb[i];
            }
            if(i != sb.length-1){
                result += " ";
            }
        }
        return result;
    }
    public String reviced(String sentence){
        String result = "";
        char arr[] = sentence.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--){
            result += arr[i];
        }
        return result;
    }
}