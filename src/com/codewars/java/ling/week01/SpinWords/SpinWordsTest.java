package com.codewars.java.ling.week01.SpinWords;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest extends SpinWords {
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}