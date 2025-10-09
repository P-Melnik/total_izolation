package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayNum88Test {

    MergeSortedArrayNum88 sut = new MergeSortedArrayNum88();

    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        //expected output [1,2,2,3,5,6]

        sut.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        assertEquals(1, nums1[0]);
        assertEquals(2, nums1[1]);
        assertEquals(2, nums1[2]);
        assertEquals(3, nums1[3]);
        assertEquals(5, nums1[4]);
        assertEquals(6, nums1[5]);

    }

    @Test
    void merge2() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        //expected output [1]

        sut.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        assertEquals(1, nums1[0]);

    }

}