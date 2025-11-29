package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementNum169Test {

    MajorityElementNum169 sut = new MajorityElementNum169();

    @Test
    void majorityElement3() {
        int[] input = {3, 2, 3};

        int res = sut.majorityElement(input);

        assertEquals(3, res);
    }

    @Test
    void majorityElement2() {
        int[] input = {2,2,1,1,1,2,2};

        int res = sut.majorityElement(input);

        assertEquals(2, res);
    }

    @Test
    void majorityElement13() {
        int[] input = {2,2,1,1,1,2,2, 13, 13, 13, 99, 100, 99, 13, 13, 13, 13, 13};

        int res = sut.majorityElement(input);

        assertEquals(13, res);
    }
}