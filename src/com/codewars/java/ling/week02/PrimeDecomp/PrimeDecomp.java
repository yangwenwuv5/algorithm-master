package com.codewars.java.ling.week02.PrimeDecomp;


import java.util.HashMap;
import java.util.Map;

/**
 * @date 2021/11/19
 * @author lingzhao
 * @link https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java
 */
public class PrimeDecomp {
    public static String factors(int n) {
        String str = "";
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 2; i <= n; i++){
            if(n%i == 0){
                if(!map.containsKey(i)){
                    map.put(i,1);
                }else {
                    map.put(i,map.get(i)+1);
                }
                if(i == n){
                    str += "(" + i + (map.get(i) > 1 ? "**" + map.get(i) : "") + ")";
                }
                n /= i;
                i--;
                continue;
            }
            if(map.containsKey(i)){
                str += "(" + i + (map.get(i) > 1 ? "**" + map.get(i) : "") + ")";
            }
        }
        return str;
    }
}
