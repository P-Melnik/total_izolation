package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersNum605Test {

    CanPlaceFlowersNum605 sut = new CanPlaceFlowersNum605();

    @Test
    void canPlaceFlowers() {
        int[] flowerBed = {1,0,0,0,1};
        int n = 1;

        boolean res = sut.canPlaceFlowers(flowerBed, n);

        assertTrue(res);
    }

    @Test
    void canPlaceFlowers2() {
        int[] flowerBed = {1,0,0,0,1};
        int n = 2;

        boolean res = sut.canPlaceFlowers(flowerBed, n);

        assertFalse(res);
    }

    @Test
    void canPlaceFlowers3() {
        int[] flowerBed = {0,0,1,0,0,0,0,1,0,0};
        int n = 3;

        boolean res = sut.canPlaceFlowers(flowerBed, n);

        assertTrue(res);
    }

    @Test
    void canPlaceFlowers4() {
        int[] flowerBed = {0,0,0};
        int n = 1;

        boolean res = sut.canPlaceFlowers(flowerBed, n);

        assertTrue(res);
    }
}