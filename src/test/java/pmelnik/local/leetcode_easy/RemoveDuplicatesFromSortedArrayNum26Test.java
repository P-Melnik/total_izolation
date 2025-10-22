package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayNum26Test {

    RemoveDuplicatesFromSortedArrayNum26 sut = new RemoveDuplicatesFromSortedArrayNum26();

    @Test
    void removeDuplicates() {
        int[] input = {1, 1, 2};

        int k = sut.removeDuplicates(input);
        assertEquals(2, input.length);
        assertEquals(1, input[0]);
        assertEquals(2, input[1]);
    }
}