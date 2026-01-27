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

        if (s == null || s.length() == 0) {
            return "";
        }

        return "";
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
