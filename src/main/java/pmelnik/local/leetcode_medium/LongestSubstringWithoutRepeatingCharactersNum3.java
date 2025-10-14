package pmelnik.local.leetcode_medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersNum3 {

    // Моя попытка решить через Set
    // time O(n2)
    // Падает на тесте s = " ";
    //todo: доработать
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0;
        int current = 0;
        Set<Character> charSet = new HashSet<>();
        int innerCounter = -1;

        for (int i = 0; i < s.length(); i++) {

            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                current++;
            } else {
                max = Math.max(max, current);
                current = 0;
                charSet.clear();
                innerCounter++;
                i = innerCounter;
            }
        }
        return max;
    }

    //Решение от ИИ через HashMap
    // time 0(n) space O(min(m,n))
    // где m размер алфавита
    // В худшем случае (все символы уникальны) хэш-таблица займет O(n) памяти.
    public int lengthOfLongestSubstringOptimized(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int maxLenth = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right);

            maxLenth = Math.max(maxLenth, right - left + 1);
        }
        return maxLenth;
    }
}
