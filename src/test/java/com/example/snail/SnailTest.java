package com.example.snail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SnailTest {
    Snail snail;


    @AfterEach
    void print() {
        snail.print();
    }

    @Test
    public void testSnail_1() {
        //given
        char width = 1;
        snail = new Snail(width);
        int[][] expected = {{1}};
        //when
        int[][] actual = this.snail.compute();
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_2() {
        //given
        char width = 2;
        snail = new Snail(width);
        int[][] expected = {
                {1, 2},
                {4, 3}
        };
        //when
        int[][] actual = snail.compute();
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_3() {
        //given
        char width = 3;
        snail = new Snail(width);
        /**
         * 1 2 3
         * 8 9 4
         * 7 6 5
         */
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        //when
        int[][] actual = snail.compute();
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_4() {
        //given
        char width = 4;
        snail = new Snail(width);
        /**
         * 1  2  3  4
         * 12 13 14 5
         * 11 16 15 6
         * 10  9  8 7
         */
        int[][] expected = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        //when
        int[][] actual = snail.compute();
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_5() {
        //given
        char width = 5;
        snail = new Snail(width);
        /**
         * 1  2  3  4  5
         * 16 17 18 19 6
         * 15 24 25 20 7
         * 14 23 22 21 8
         * 13 12 11 10 9
         */
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        //when
        int[][] actual = snail.compute();
        //then

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_6() {
        char width = 6;
        snail = new Snail(width);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6},
                {20, 21, 22, 23, 24, 7},
                {19, 32, 33, 34, 25, 8},
                {18, 31, 36, 35, 26, 9},
                {17, 30, 29, 28, 27, 10},
                {16, 15, 14, 13, 12, 11}
        };
        int[][] actual = snail.compute();
        //then

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_100() {
        char width = 100;
        snail = new Snail(width);
        snail.compute();
    }

}
