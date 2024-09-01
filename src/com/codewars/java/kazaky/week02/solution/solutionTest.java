package com.codewars.java.kazaky.week02.solution;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class solutionTest {
    @Test
    public void testSomething() {
        // assertEquals("expected", "actual");
        assertEquals(false,solution.solution("abc","abbc"));
        assertEquals(false,solution.solution("abc","d"));
    }
}