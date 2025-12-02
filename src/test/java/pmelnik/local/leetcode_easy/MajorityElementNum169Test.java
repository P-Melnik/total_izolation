package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementNum169Test {

    MajorityElementNum169 sut = new MajorityElementNum169();

    @Test
    void majorityElementHash3() {
        int[] input = {3, 2, 3};

        int res = sut.majorityElementHashMapSolution(input);

        assertEquals(3, res);
    }

    @Test
    void majorityElementHash2() {
        int[] input = {2,2,1,1,1,2,2};

        int res = sut.majorityElementHashMapSolution(input);

        assertEquals(2, res);
    }

    @Test
    void majorityElementHash13() {
        int[] input = {2,2,1,1,1, 13, 13, 13
                ,2,2, 13, 13, 13, 99, 100, 99, 13, 13, 13, 13, 13, 13};

        int res = sut.majorityElementHashMapSolution(input);

        assertEquals(13, res);
    }


}