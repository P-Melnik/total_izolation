package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class TwoSumNum1Test {

    TwoSumNum1 sut = new TwoSumNum1();

    @Test
    void twoSumTest() {
        int[] nums  = {2,7,11,15};
        int target = 9;

        int[] res = sut.twoSum(nums, target);

        System.out.println(Arrays.toString(res));

        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
    }

    @Test
    void twoSumTest2() {
        int[] nums  = {3, 2, 4};
        int target = 6;

        int[] res = sut.twoSum(nums, target);

        System.out.println(Arrays.toString(res));

        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }

    @Test
    void twoSum2Test() {
        int[] nums  = {2,7,11,15};
        int target = 9;

        int[] res = sut.twoSum2(nums, target);

        System.out.println(Arrays.toString(res));

        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
    }

    @Test
    void twoSum2Test2() {
        int[] nums  = {3, 2, 4};
        int target = 6;

        int[] res = sut.twoSum2(nums, target);

        System.out.println(Arrays.toString(res));

        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }

}