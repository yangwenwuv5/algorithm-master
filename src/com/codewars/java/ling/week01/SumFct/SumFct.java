package com.codewars.java.ling.week01.SumFct;

import java.math.BigInteger;

/**
 * @date 2021/11/12
 * @author lingzhao
 * @link https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java
 */
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        int number = n.intValue();
        BigInteger p = BigInteger.valueOf(0),p1 = BigInteger.valueOf(1),p2 = BigInteger.valueOf(1);
        if( number <= 1 ){
            return BigInteger.valueOf(4).multiply(n);
        }
        BigInteger i = p;
        while (!n.equals(i)){
            p = p1.add(p2);
            p1 = p2;
            p2 = p;
            i = i.add(BigInteger.valueOf(1));
        }
        p = p.add(p1);
        p = p.subtract(BigInteger.valueOf(1));
        return BigInteger.valueOf(4).multiply(p);
    }
}
