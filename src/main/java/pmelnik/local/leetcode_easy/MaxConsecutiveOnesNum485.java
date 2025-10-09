package pmelnik.local.leetcode_easy;

/**
 * Довольно простая задача
 * время O(n)
 * память O(1)
 */
public class MaxConsecutiveOnesNum485 {

    public int findMaxConsecutiveOnes(int[] arr) {
        int counter = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            int temp = 0;
            while (i <= arr.length - 1 && arr[i] == 1) {
                temp++;
                i++;
            }
            if (temp > counter) counter = temp;
        }
        return counter;
    }

}
