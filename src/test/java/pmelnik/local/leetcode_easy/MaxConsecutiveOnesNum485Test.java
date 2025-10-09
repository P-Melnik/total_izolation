package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesNum485Test {

    MaxConsecutiveOnesNum485 sut = new MaxConsecutiveOnesNum485();

    @Test
    void findMaxConsecutiveOnesTest() {

        int[] input = {1,1,0,1,1,1};

        int res = sut.findMaxConsecutiveOnes(input);

        assertEquals(3, res);
    }

    @Test
    void findMaxConsecutiveOnesTest2() {

        int[] input = {1,0,1,1,0,1};

        int res = sut.findMaxConsecutiveOnes(input);

        assertEquals(2, res);
    }

}