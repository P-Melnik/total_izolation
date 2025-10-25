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
}
