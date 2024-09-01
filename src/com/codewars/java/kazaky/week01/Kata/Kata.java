package com.codewars.java.kazaky.week01.Kata;



import java.util.Arrays;

/*
  Created with IntelliJ IDEA.

  @Author:  YangWenWu
 * @Date:  2021/11/11/19:51
 * @Description: highAndLow
 */
public class Kata {
    public static String highAndLow(String numbers) {
        // Code here or
        if(numbers.length()==0){
            return "   ";
        }
        String[] number = numbers.split(" ");
        int lth = number.length;
        int[] array = new int[lth];
        for(int i =0;i<lth;i++){
            array[i] = Integer.parseInt(number[i]);
        }
        Arrays.sort(array);
        return array[lth - 1] +" "+ array[0];
    }
}