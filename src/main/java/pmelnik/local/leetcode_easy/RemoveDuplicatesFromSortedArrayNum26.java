package pmelnik.local.leetcode_easy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * ---
 * int k = removeDuplicates(nums); // Calls your implementation
 * ---
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 *
 */
public class RemoveDuplicatesFromSortedArrayNum26 {

    //Мое решение через TreeSet
    //time O(n+n)
    //O(n log n) - TreeSet добавляет элементы за O(log n) каждый
    //не in-place
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int index = 0;
        for (Integer i : set) {
            nums[index] = i;
            index++;
        }
        return set.size();
    }

    //Оптимальное решение (Two Pointers)
    //Используем два указателя:
    //slow - указывает на позицию для следующего уникального элемента
    //fast - ищет следующий уникальный элемент
    // ---
    //Анализ сложности оптимального решения
    //Время: O(n) - один проход по массиву
    //Память: O(1) - только константная дополнительная память
    public int removeDuplicatesTwoPointers(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0; // Указатель для записи уникальных элементов

        // fast начинает с 1, так как первый элемент всегда уникален
        for (int fast = 1; fast < nums.length; fast++) {
            // Если нашли новый уникальный элемент
            if (nums[fast] != nums[slow]) {
                slow++; // Перемещаем указатель записи
                nums[slow] = nums[fast]; // Записываем уникальный элемент
            }
            // Если элементы одинаковые, просто пропускаем (fast++ в цикле)
        }

        // Количество уникальных элементов = slow + 1
        return slow + 1;
    }

}
