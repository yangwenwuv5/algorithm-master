package com.codewars.java.kazaky.week01.NumberFun;

/**
 * @author KaZaKy
 */
public class NumberFun {
    public static long findNextSquare(long sq) {

        double sqrt = Math.sqrt(sq);
        long integer = (long)sqrt;
        long next = integer;
        long num;
        if(sqrt - integer == 0){
            next += 1;
            num = next * next;
            return num;
        }else{
            return -1;
        }
    }
}
