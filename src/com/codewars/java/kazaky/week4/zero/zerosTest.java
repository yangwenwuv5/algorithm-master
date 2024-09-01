package com.codewars.java.kazaky.week4.zero;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class zerosTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(zeros.zeros(0), is(0));
        assertThat(zeros.zeros(6), is(1));
        assertThat(zeros.zeros(14), is(2));
    }

}