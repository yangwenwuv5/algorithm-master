package com.codewars.java.kazaky.week03.Kata;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YangWenWu
 * @Date: 2021/11/25/19:48
 * @Description:
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KataTest {
    private static String _high(String s) {
        return Stream.of(s.split(" "))
                .sorted(Comparator.comparing((String a) -> a.chars().map(b -> b - 96).sum()).reversed())
                .findFirst().get();
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", Kata.high("aa b"));
        assertEquals("b", Kata.high("b aa"));
        assertEquals("bb", Kata.high("bb d"));
        assertEquals("d", Kata.high("d bb"));
        assertEquals("aaa", Kata.high("aaa b"));
    }

    @Test
    public void randomTests() {
        String chars = "      abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            String test = IntStream.range(10, random.nextInt(201))
                    .mapToObj(x -> Character.toString(chars.charAt(random.nextInt(chars.length()))))
                    .collect(Collectors.joining()).trim().replaceAll("\\s+", " ");

            String expected = _high(test);
            String actual = Kata.high(test);

            assertEquals(expected, actual);
        }
    }
}