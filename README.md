# Snail kata

The aim of this kata is to create Snails of different sizes (belonging to natural integers > 0).
A Snail is a 2 dimensions matrix filled with incrementing numbers, in a snail shape as described in the following(non-exhaustive) tests suite:

    @Test
    public void testSnail_1() {
        //given
        Snail snail = new Snail(1);
        int[][] expected = {{1}};
        //when
        int[][] actual = snail.compute();
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSnail_2() {
        //given
        Snail snail = new Snail(2);
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
        Snail snail = new Snail(3);
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
        Snail snail = new Snail(4);
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
        Snail snail = new Snail(5);
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
