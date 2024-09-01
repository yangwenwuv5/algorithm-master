package com.codewars.java.ling.week01.DuplicateEncoder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DuplicateEncoderTest extends DuplicateEncoder {
    @Test
    public void test() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}