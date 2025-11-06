package pmelnik.local.leetcode_easy;

/**
 * Краткое описание решения
 * Подход "скользящего окна"
 * проходим по строке haystack и для каждой возможной стартовой позиции проверяем,
 * совпадает ли подстрока с needle.
 * Анализ сложности
 * Время: O(n × m) в худшем случае, где n - длина haystack, m - длина needle
 * Память: O(1) - только константная дополнительная память
 */
public class FindTheIndexOfTheFirstOccurrenceInAStringNum28 {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Edge cases
        if (m == 0) return 0;
        if (n < m) return -1;

        // Проходим по haystack, проверяя все возможные стартовые позиции
        for (int i = 0; i <= n - m; i++) {
            // Проверяем, совпадает ли подстрока начиная с позиции i с needle
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }

        return -1;
    }

}
