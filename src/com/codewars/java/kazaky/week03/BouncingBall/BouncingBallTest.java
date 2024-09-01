package com.codewars.java.kazaky.week03.BouncingBall;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/24/19:59
 * @Description:
 */
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


public class BouncingBallTest {

    @Test
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
}