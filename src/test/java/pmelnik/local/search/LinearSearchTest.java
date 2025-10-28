package pmelnik.local.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    LinearSearch sut = new LinearSearch();

    @Test
    void search() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 23;

        int res = sut.search(input, target);

        assertEquals(5, res);
    }

    @Test
    void searchNotFound() {
        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 13;

        int res = sut.search(input, target);

        assertEquals(-1, res);
    }

//    //todo: add tests for multiple appearances search
//    @Test
//    void searchAllAppearances() {
//        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
//        int target = 23;
//    }
//
//    @Test
//    void searchAllAppearancesNotFound() {
//        int[] input = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
//        int target = 13;
//    }
}