package pmelnik.local.leetcode_easy;

public class LongestCommonPrefixNum14 {


    // Мое решение
    // time O(s) - s = sum of all characters in all strings
    // space O(1)
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int minLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        for (int j = 0; j < minLength; j++) {

            char currentChar = strs[0].charAt(j);

            for (int x = 1; x < strs.length; x++) {

                if (strs[x].charAt(j) != currentChar) {
                    return strs[0].substring(0, j);
                }
            }
        }

        return strs[0].substring(0, minLength);
    }

    //more simplified solution
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Сокращаем prefix пока не станет префиксом текущей строки
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
