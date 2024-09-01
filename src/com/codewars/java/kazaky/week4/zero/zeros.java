package com.codewars.java.kazaky.week4.zero;

/**
 * @author KaZaKy
 */
public class zeros {
    public static int zeros(int n) {
        int zerocount = 0;
        for (int i = 5; n / i > 0; i *= 5) {
            zerocount += n / i;
        }
        return zerocount;
    }
}

