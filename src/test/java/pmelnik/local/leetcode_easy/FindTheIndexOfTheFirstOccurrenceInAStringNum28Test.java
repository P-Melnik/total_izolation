package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringNum28Test {

    FindTheIndexOfTheFirstOccurrenceInAStringNum28 sut = new FindTheIndexOfTheFirstOccurrenceInAStringNum28();

    @Test
    void strStr() {
        //haystack = "sadbutsad", needle = "sad"
        String haystack = "sadbutsad";
        String needle = "sad";

        int res = sut.strStr(haystack, needle);

        assertEquals(0, res);
    }

    @Test
    void strStrNotFound() {
        //haystack = "sadbutsad", needle = "sad"
        String haystack = "leetcode";
        String needle = "leeto";

        int res = sut.strStr(haystack, needle);

        assertEquals(1, res);
    }
}