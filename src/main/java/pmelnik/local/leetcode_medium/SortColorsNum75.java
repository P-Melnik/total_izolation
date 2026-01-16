package pmelnik.local.leetcode_medium;

/**
 * Анализ сложности
 * Время: O(n) - один проход по массиву
 * Память: O(1) - сортировка на месте
 * ---
 * Это классическая задача "Sort Colors" (Голландский национальный флаг).
 * Краткое описание решения
 * Используем алгоритм Dutch National Flag Problem (разработан Эдом Дейкстрой).
 * Используем три указателя для разделения массива на три части.
 * ---
 * Алгоритм Dutch National Flag
 * Используем три указателя:
 * low - для 0 (красный), указывает на позицию после последнего 0
 * mid - текущий элемент
 * high - для 2 (синий), указывает на позицию перед первым 2
 * Правила:
 * Если nums[mid] == 0 → меняем с nums[low], увеличиваем low и mid
 * Если nums[mid] == 1 → просто увеличиваем mid
 * Если nums[mid] == 2 → меняем с nums[high], уменьшаем high
 */
public class SortColorsNum75 {

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Меняем nums[mid] и nums[low]
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Просто пропускаем
                mid++;
            } else { // nums[mid] == 2
                // Меняем nums[mid] и nums[high]
                swap(nums, mid, high);
                high--;
                // mid НЕ увеличиваем, так как нужно проверить новый элемент на позиции mid
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
