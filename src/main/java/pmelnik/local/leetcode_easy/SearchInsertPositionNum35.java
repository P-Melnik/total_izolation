package pmelnik.local.leetcode_easy;

/**
 * Краткое описание решения
 * Используем бинарный поиск для нахождения позиции целевого значения
 * в отсортированном массиве. Если значение не найдено, возвращаем позицию,
 * куда его нужно вставить.
 * Ключевая идея
 * В бинарном поиске, когда мы не находим целевой элемент,
 * left указывает на позицию, куда нужно вставить элемент.
 * Анализ сложности
 * Время: O(log n) - классический бинарный поиск
 * Память: O(1) - только константная дополнительная память
 */
public class SearchInsertPositionNum35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid; // Ищем в левой половине включая mid
            } else {
                left = mid + 1; // Ищем в правой половине
            }
        }

        return left;
    }
}
