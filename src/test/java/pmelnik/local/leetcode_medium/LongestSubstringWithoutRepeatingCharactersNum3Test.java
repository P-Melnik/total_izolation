package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersNum3Test {

    LongestSubstringWithoutRepeatingCharactersNum3 sut
            = new LongestSubstringWithoutRepeatingCharactersNum3();

    @Test
    void lengthOfLongestSubstring() {
        String input = "a bcabcbb";

        int res = sut.lengthOfLongestSubstring(input);

        assertEquals(3, res);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String input = "bbbbb";

        int res = sut.lengthOfLongestSubstring(input);

        assertEquals(1, res);
    }

    @Test
    void lengthOfLongestSubstring3() {
        String input = "pwwkew";

        int res = sut.lengthOfLongestSubstring(input);

        assertEquals(3, res);
    }

}