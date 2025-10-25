package pmelnik.local.leetcode_easy;

public class RemoveElementNum27 {

    //Время: O(n) - каждый элемент обрабатывается максимум один раз
    //Память: O(1) - только константная дополнительная память
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    //более простое решение
    //Время: O(n) - каждый элемент обрабатывается максимум один раз
    //Память: O(1) - только константная дополнительная память
    public int removeElementTwoPointers(int[] nums, int val) {
        // указатель для записи элемнтов не равных val
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[val];
                k++;
            }
        }
        return k;
    }
}
