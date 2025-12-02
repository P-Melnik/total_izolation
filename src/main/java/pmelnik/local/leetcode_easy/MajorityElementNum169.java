package pmelnik.local.leetcode_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Есть несколько подходов для данной задачи:
 * Boyer-Moore Voting Algorithm - O(n) время, O(1) память (оптимальное)
 * Хэш-таблица - O(n) время, O(n) память
 * Сортировка - O(n log n) время, O(1) память
 */
public class MajorityElementNum169 {

    //The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.

    public int majorityElementHashMapSolution(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }

        return -1;
    }
}
