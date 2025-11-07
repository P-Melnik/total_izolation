package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsNum70Test {

    ClimbingStairsNum70 sut = new ClimbingStairsNum70();

    @Test
    void climbStairs() {
        int stairs = 2;

        int res = sut.climbStairs(stairs);
        assertEquals(2, res);
    }

    @Test
    void climbStairs2() {
        int stairs = 3;

        int res = sut.climbStairs(stairs);
        assertEquals(3, res);
    }
}