package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayNum26Test {

    RemoveDuplicatesFromSortedArrayNum26 sut = new RemoveDuplicatesFromSortedArrayNum26();

    @Test
    void removeDuplicates() {
        int[] input = {1, 1, 2};

        int k = sut.removeDuplicates(input);
        assertEquals(2, k);
        assertEquals(1, input[0]);
        assertEquals(2, input[1]);
    }

    @Test
    void removeDuplicates2() {
        int[] input = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        int k = sut.removeDuplicates(input);
        assertEquals(5, k);
        assertEquals(1, input[0]);
        assertEquals(2, input[1]);
        assertEquals(5, input[4]);
    }
}