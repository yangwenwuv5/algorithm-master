package com.codewars.java.ling.week02.Fracts;

/**
 * @date 2021/11/16
 * @author lingzhao
 * @link https://www.codewars.com/kata/54d7660d2daf68c619000d95/train/java
 */
public class Fracts {
    // your code
    public static String convertFrac(long[][] lst) {
        String str = "";
        int len1 = lst.length;
        long[] mul = new long[len1];
        long[] div = new long[len1];
        for(int i = 0; i < len1; i++){
            long fenzi = lst[i][0];
            long fenmu = lst[i][1];
            long gcd = gcd(fenzi,fenmu);
            mul[i] = lst[i][1]/gcd;
            div[i] = lst[i][0]/gcd;
        }
        long fra = multify(mul);
        for(int i = 0; i < len1; i++){
            String re = "(" + fra/mul[i]*div[i] + "," + fra + ")";
            str += re;

        }
        return str;
    }
    public static long gcd(long a, long b){
        long max,min;
        max = a > b ? a : b;
        min = a < b ? a : b;
        if(max % min != 0){
            return gcd(min,max % min);
        }else {
            return min;
        }
    }
    public static long multify(long[] mul){
        long result = 1;
        for(long m : mul){
            result = result * m / gcd(result,m);
        }
        return result;
    }
}
