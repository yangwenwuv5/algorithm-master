package com.codewars.java.ling.week02.Solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest extends Solution {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true,Solution.validParentheses( "()" ));
        assertEquals(false,Solution.validParentheses( "())" ));
        assertEquals(true,Solution.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,Solution.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,Solution.validParentheses( "adasdasfa" ));
    }
}