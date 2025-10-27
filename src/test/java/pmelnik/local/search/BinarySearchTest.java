package pmelnik.local.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch sut = new BinarySearch();

    @Test
    void binarySearch() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 23;

        int result = sut.binarySearch(input, target);

        assertEquals(target, result);
    }

    @Test
    void binarySearchNotFound() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 13;

        int result = sut.binarySearch(input, target);

        assertEquals(target, -1);
    }
}