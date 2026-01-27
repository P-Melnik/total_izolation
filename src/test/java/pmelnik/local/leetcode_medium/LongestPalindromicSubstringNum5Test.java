package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringNum5Test {

    LongestPalindromicSubstringNum5 sut =
            new LongestPalindromicSubstringNum5();

    @Test
    void longestPalindromicSubstring() {
        String input = "babad";
        String expectedResult = "aba";

        String result = sut.longestPalindromicSubstring(input);

        assertEquals(expectedResult, result);
    }

    @Test
    void longestPalindromicSubstring2() {
        String input = "cbbd";
        String expectedResult = "bb";

        String result = sut.longestPalindromicSubstring(input);

        assertEquals(expectedResult, result);
    }

}