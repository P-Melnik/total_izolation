package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneNum66Test {

    PlusOneNum66 sut = new PlusOneNum66();

    @Test
    void plusOne1() {
        int[] input = {1, 2, 3};

        int[] res = sut.plusOne(input);

        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
        assertEquals(4, res[2]);
    }

    @Test
    void plusOne2() {
        int[] input = {4, 3, 2, 1};

        int[] res = sut.plusOne(input);

        assertEquals(4, res[0]);
        assertEquals(3, res[1]);
        assertEquals(2, res[2]);
        assertEquals(2, res[3]);
    }

    @Test
    void plusOne3() {
        int[] input = {9};

        int[] res = sut.plusOne(input);

        assertEquals(1, res[0]);
        assertEquals(0, res[1]);
    }
}