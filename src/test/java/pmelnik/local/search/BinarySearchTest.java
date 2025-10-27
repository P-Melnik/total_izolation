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

        assertEquals(5, result);
    }

    @Test
    void binarySearchNotFound() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 13;

        int result = sut.binarySearch(input, target);

        assertEquals(-1, -1);
    }

    @Test
    void binarySearchRecursive() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 23;

        int result = sut.binarySearchRecursive(input, target, 0, input.length);

        assertEquals(5, result);
    }

    @Test
    void binarySearchNotFoundRecursive() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 13;

        int result = sut.binarySearchRecursive(input, target, 0, input.length);

        assertEquals(-1, -1);
    }
}