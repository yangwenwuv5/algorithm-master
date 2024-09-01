package com.codewars.java.kazaky.week01.Kata;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/11/20:56
 * @Description:
 */
public class KataTest {
    @Test
    public void test1() {
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
