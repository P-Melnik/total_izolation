package pmelnik.local.leetcode_easy;

public class MergeSortedArrayNum88 {

    //my solution
    //O(n2) time & O(1) space
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        for (int i = 0; i < m; i++) {

            if (nums1[i] > nums2[0]) {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;

                int firstElement = nums2[0];
                int j = 1;

                while (j < n && nums2[j] < firstElement) {
                    nums2[j - 1] = nums2[j];
                    j++;
                }
                nums2[j - 1] = firstElement;
            }
        }

        for (int j = m, i = 0; j < m + n; j++, i++) {
            nums1[j] = nums2[i];
        }
    }

    //additional and better solution
    //O(m+n) time + O(1) space
    public void optimizedMerge(int[] nums1, int m, int[] nums2, int n) {
        int nums1end = m - 1;
        int nums2end = n - 1;
        int end = m + n - 1;

        //идем с конца и заполняем наибольшими элементами
        while (nums2end >= 0) {
            if (nums1end >= 0 && nums1[nums1end] > nums2[nums2end]) {
                nums1[end] = nums1[nums1end];
                nums1end--;
            } else {
                nums1[end] = nums2[nums2end];
                nums2end--;
            }
            end--;
        }
    }

}
