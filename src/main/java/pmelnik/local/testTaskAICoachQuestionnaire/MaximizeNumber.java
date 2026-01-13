package pmelnik.local.testTaskAICoachQuestionnaire;

import java.util.Arrays;

public class MaximizeNumber {

    /**
     * Анализ сложности:
     * Временная сложность: O(m log m + n)
     * Arrays.sort(bSorted): O(m log m) - сортировка массива длиной m (длина B)
     * Цикл for: O(n) - один проход по массиву длиной n (длина A)
     * Итого: O(m log m + n)
     * Пространственная сложность: O(n + m)
     * bSorted: O(m) - копия строки B в виде массива
     * result: O(n) - копия строки A в виде массива
     * Итого: O(n + m) дополнительной памяти
     * Принцип работы алгоритма
     * Основная идея
     * Максимизировать число A,
     * заменяя его цифры на самые большие доступные цифры из B,
     * двигаясь от старших разрядов к младшим.
     * Шаг 1: Подготовка данных
     *    1. Сортируем цифры B по возрастанию → получаем доступ к большим цифрам с конца
     *    2. Создаем копию A для модификации
     *    3. Устанавливаем указатель bPtr на самую большую цифру B
     * Шаг 2: Проход по цифрам A
     *    Для каждой позиции i от 0 до n-1 (от старших разрядов к младшим):
     *       1. Проверяем, есть ли еще цифры в B (bPtr >= 0)
     *       2. Сравниваем текущую наибольшую цифру из B с текущей цифрой A:
     *          - Если цифра из B СТРОГО больше цифры A:
     *            * Заменяем цифру A на цифру из B
     *            * Сдвигаем указатель bPtr на следующую большую цифру в B
     *          - Если цифра из B меньше или равна:
     *            * Пропускаем (оставляем исходную цифру A)
     * Шаг 3: Возврат результата
     * Возвращаем модифицированную строку A
     */
    public String maximizeA(String A, String B) {
        if (A == null || A.isEmpty()) return "";
        if (B == null || B.isEmpty()) return A;

        char[] bSorted = B.toCharArray();
        Arrays.sort(bSorted);

        char[] result = A.toCharArray();
        int bMaxDigit = bSorted.length - 1; // указатель на самую большую цифру

        for (int i = 0; i < result.length && bMaxDigit >= 0; i++) {
            // Заменяем только если цифра из B строго больше
            if (bSorted[bMaxDigit] > result[i]) {
                result[i] = bSorted[bMaxDigit];
                bMaxDigit--;
            }
        }

        return new String(result);
    }
}
