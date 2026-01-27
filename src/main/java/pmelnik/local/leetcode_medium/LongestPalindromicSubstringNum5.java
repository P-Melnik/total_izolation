package pmelnik.local.leetcode_medium;

/**
 * Краткое описание решения
 * Используем подход "расширение от центра".
 * Для каждого символа (и для каждой пары символов) проверяем,
 * можно ли расширить палиндром в обе стороны.
 * ---
 * Анализ сложности
 * Время: O(n²) - для каждого центра (2n-1 центров) расширяем потенциально до O(n)
 * Память: O(1) - только константная дополнительная память
 */
public class LongestPalindromicSubstringNum5 {


    public String longestPalindromicSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Проверяем палиндромы нечетной длины (центр в i)
            int len1 = expandAroundCenter(s, i, i);
            // Проверяем палиндромы четной длины (центр между i и i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            // Берем максимальную длину
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        // Расширяем в обе стороны, пока символы совпадают
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left -1;
    }
}
