package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayNum643Test {

    MaximumAverageSubarrayNum643 sut = new MaximumAverageSubarrayNum643();

    @Test
    void findMaxAverage() {

        int[] init = {1,12,-5,-6,50,3};
        int k = 4;

        double res = sut.findMaxAverage(init, k);

        assertEquals(12.75000, res);
    }

    @Test
    void findMaxAverage2() {

        int[] init = {5};
        int k = 1;

        double res = sut.findMaxAverage(init, k);

        assertEquals(5.00000, res);
    }

    @Test
    void findMaxAverageOptimized() {

        int[] init = {1,12,-5,-6,50,3};
        int k = 4;

        double res = sut.optimizedFindMaxAverage(init, k);

        assertEquals(12.75000, res);
    }

    @Test
    void findMaxAverageOptimized2() {

        int[] init = {5};
        int k = 1;

        double res = sut.optimizedFindMaxAverage(init, k);

        assertEquals(5.00000, res);
    }

}