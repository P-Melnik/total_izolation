package pmelnik.local.leetcode_medium;

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
