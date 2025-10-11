package pmelnik.local.leetcode_easy;


public class MaximumAverageSubarrayNum643 {

    // Не очень хорошее решение с O(n * k) по времени
    public double findMaxAverage(int[] nums, int k) {
        double maxResult = -Double.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int currentSum = 0;
            double currentResult;
            for (int j = i; j < k + i; j++) {
                currentSum += nums[j];
            }
            currentResult = (double) currentSum / k;
            if (currentResult > maxResult) maxResult = currentResult;
        }
        return maxResult;
    }

    // решение в стиле sliding window
    // Временаня O(n)
    public double optimizedFindMaxAverage(int[] nums, int k) {
        double maxResult = -Double.MAX_VALUE;
        return  maxResult;
    }

}
