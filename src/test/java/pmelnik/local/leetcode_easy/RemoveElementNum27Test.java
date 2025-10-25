package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementNum27Test {

    RemoveElementNum27 sut = new RemoveElementNum27();

    @Test
    void removeElement() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int res = sut.removeElement(nums, val);

        assertEquals(2, res);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void removeElement2() {
        int[] nums = {3, 10, 10, 10, 2, 2, 3, 10, 10, 10, 11, 67, 10092, 8585, 22};
        int val = 10;
        int res = sut.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));

        assertEquals(9, res);
    }

}