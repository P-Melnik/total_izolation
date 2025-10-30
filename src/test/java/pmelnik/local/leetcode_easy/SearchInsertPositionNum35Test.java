package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionNum35Test {

    SearchInsertPositionNum35 sut = new SearchInsertPositionNum35();

    @Test
    void searchInsert() {

        int[] input = {1, 2, 3, 5, 7};
        int target = 5;

        int res = sut.searchInsert(input, target);

        assertEquals(3, res);
    }

    @Test
    void searchInsert2() {

        int[] input = {1, 2, 3, 5, 7};
        int target = 2;

        int res = sut.searchInsert(input, target);

        assertEquals(1, res);
    }

    @Test
    void searchInsertNotExist() {

        int[] input = {1, 2, 3, 5, 7};
        int target = 4;

        int res = sut.searchInsert(input, target);

        assertEquals(3, res);
    }
}