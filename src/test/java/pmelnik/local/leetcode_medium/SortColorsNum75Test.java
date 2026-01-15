package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsNum75Test {

    SortColorsNum75 sut = new SortColorsNum75();

    @Test
    void sortColors_1() {
        int[] input = {2,0,2,1,1,0};

        sut.sortColors(input);

        assertEquals(input[0], 0);
        assertEquals(input[1], 0);
        assertEquals(input[2], 1);
        assertEquals(input[3], 1);
        assertEquals(input[4], 2);
        assertEquals(input[5], 2);
    }

    @Test
    void sortColors_2() {
        int[] input = {2,0,1};

        sut.sortColors(input);

        assertEquals(input[0], 0);
        assertEquals(input[1], 1);
        assertEquals(input[2], 2);
    }

}