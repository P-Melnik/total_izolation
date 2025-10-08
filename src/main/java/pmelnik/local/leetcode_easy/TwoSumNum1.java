package pmelnik.local.leetcode_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Время: O(n²) - в худшем случае проходим по всем парам элементов
 * Память: O(1) - дополнительная память не зависит от размера входных данных
 * ------
 * Альтернативное решение: O(n) по времени, O(n) по памяти
 * Дополнительно используем HashMap
 */

public class TwoSumNum1 {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i ++) {
            int marker = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == marker) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[2];
    }

    //Альтернативное решение
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int marker = target - nums[i];

            if (map.containsKey(marker)){
                return new int[]{map.get(marker), i};
            }

            map.put(nums[i], i);
        }

        return new int[2];
    }

}
