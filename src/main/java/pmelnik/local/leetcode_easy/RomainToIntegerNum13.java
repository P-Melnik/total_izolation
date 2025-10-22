package pmelnik.local.leetcode_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Основная идея: римские цифры обычно записываются от больших к меньшим слева направо, но есть 6 особых случаев, когда меньшая цифра стоит перед большей (это означает вычитание).
 * Алгоритм:
 * Проходим по строке слева направо
 * Если текущая цифра МЕНЬШЕ следующей - это случай вычитания, вычитаем текущую цифру
 * Если текущая цифра БОЛЬШЕ или РАВНА следующей - это сложение, прибавляем текущую цифру
 * Для последней цифры всегда прибавляем
 * Анализ сложности
 * Время: O(n), где n - длина римской строки. Проходим по строке один раз.
 * Память: O(1), используем только константную дополнительную память.
 */
public class RomainToIntegerNum13 {

    public int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < n - 1 && current < romanMap.get(s.charAt(i + 1))) {
                // Случай вычитания (IV, IX, XL, XC, CD, CM)
                result -= current;
            } else {
                // Случай сложения или последняя цифра
                result += current;
            }
        }
        return result;
    }

}
