package com.codewars.java.kazaky.week03.Kata;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/25/19:32
 * @Description:
 */
public class Kata {

    public static String high(String s) {
        // Your code here...
       String[] str = s.split(" ");
       int flag = 0,max = 0,value = 0;
       for(int i=0;i< str.length;i++){
           for(int j = 0;j<str[i].length();j++){
               value = ValueToA(str[i].charAt(j)) + value;
           }
           if(value>max){
               max = value;
               flag = i;
           }
           value = 0;
       }

        return str[flag];
    }
    public static int ValueToA(Character character){
        return character - 'a' + 1;
    }

}