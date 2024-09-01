package com.codewars.java.ling.week01.Prime;

/**
 * @date 2021/11/10
 * @author lingzhao
 * @link https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
 */
public class Prime {
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
