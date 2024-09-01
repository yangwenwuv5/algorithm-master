package com.codewars.java.kazaky.week01.NumberFun;

/*
  Created with IntelliJ IDEA.

  @Author: YangWenWu
 * @Date: 2021/11/08/21:31
 * @Description:
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }


}