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

        for (int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--) {

        }
        return "";
    }
}
