package com.codewars.java.kazaky.week01.solution;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/15/19:41
 * @Description:
 */
public class Solution {
    public int solution(int number) {
        int temp = 0;
       for(int i = 1;i<number;i=i+1){
           if(i%3 ==0 || i%5==0){
               temp = i + temp;
           }
       }
        return temp;
    }
}
