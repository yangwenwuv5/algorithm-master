package com.codewars.java.ling.week02.PrimeDecomp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeDecompTest extends PrimeDecomp {
    @Test
    public void testPrimeDecompOne() {
        int lst = 86240;
        assertEquals(
                "(2**5)(5)(7**2)(11)",
                PrimeDecomp.factors(lst));
    }
}