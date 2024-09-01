package com.leetcode.java.kazaky.maxProfit;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0,pre = 0,head = 0;
        while(pre<prices.length){
            if(prices[pre]-prices[head]>max){
                max = prices[pre++]-prices[head];
            }else if(prices[pre]-prices[head]<=0){
                head = pre++;
            }else {
                pre++;
            }
        }
        if(max>0){
            return max;
        }else {
            return 0;
        }
    }
}