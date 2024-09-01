package com.codewars.java.ling.week02.Fracts;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FractsTest {
    @Test
    public void test_fractions() throws Exception {
        long[][] lst;
        lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
        assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
    }
}
