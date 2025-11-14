package pmelnik.local.leetcode_easy;

/**
 * Проходим по строке с конца,
 * пропускаем trailing spaces,
 * затем считаем длину последнего слова до следующего пробела или начала строки.
 * ---
 * Анализ сложности
 * Время: O(n), где n - длина строки (в худшем случае проходим всю строку)
 * Память: O(1) - только константная дополнительная память
 */
public class LengthOfLastWordNum58 {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Пропускаем пробелы в конце строки
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Считаем длину последнего слова
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
