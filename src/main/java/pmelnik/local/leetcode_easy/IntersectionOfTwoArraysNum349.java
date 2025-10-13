package pmelnik.local.leetcode_easy;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysNum349 {

    //решение через создание сетов
    // Время O(m + n)
    // Память O(m + n)
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j])) {
                set2.add(nums2[j]);
            }
        }
        return set2.stream().mapToInt(Integer::intValue).toArray();
    }

    // Компактная версия решения
    public int[] intersectionCompact(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2)
                .filter(set1::contains)
                .distinct()
                .toArray();
    }
}

