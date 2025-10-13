package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysNum349Test {

    IntersectionOfTwoArraysNum349 sut = new IntersectionOfTwoArraysNum349();

    @Test
    void intersection() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = sut.intersection(nums1, nums2);

        assertEquals(2, res[0]);
    }
}