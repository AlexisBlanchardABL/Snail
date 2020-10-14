package com.example.snail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SnailTest {
    Snail snail;

    @BeforeEach
    public void setup() {
        snail = new Snail();
    }

    @Test
    public void testSnail1() {
        //given
        int n = 1;
        int[][] expected = {{1}};
        //when
        int[][] actual = this.snail.snail(n);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail2() {
        //given
        int n = 2;
        int[][] expected = {{1, 2}, {4, 3}};
        //when
        int[][] actual = this.snail.snail(n);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail3() {
        //given
        int n = 3;
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        //when
        int[][] actual = this.snail.snail(n);
        //then
        assertArrayEquals(expected, actual);
    }
}
