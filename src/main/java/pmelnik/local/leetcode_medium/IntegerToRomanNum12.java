package pmelnik.local.leetcode_medium;

/**
 * Краткое описание решения
 * Используем жадный алгоритм:
 * на каждом шаге берем максимально возможное римское число из таблицы соответствий,
 * вычитаем его значение и добавляем символ к результату.
 * ---
 * Анализ сложности
 * Время: O(1) - константное время, так как таблица фиксированного размера (13 элементов)
 * Память: O(1) - константная память
 */
public class IntegerToRomanNum12 {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            // Пока текущее значение можно вычесть из num
            while (num >= values[i]) {
                num -= values[i];       // Вычитаем значение
                result.append(symbols[i]); // Добавляем символ
            }
        }

        return result.toString();
    }

}
