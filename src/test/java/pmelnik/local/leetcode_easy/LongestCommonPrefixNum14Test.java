package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixNum14Test {

    LongestCommonPrefixNum14 sut = new LongestCommonPrefixNum14();

    @Test
    void longestCommonPrefix() {

        String[] input = {"flower","flow","flight"};

        String result = sut.longestCommonPrefix(input);
        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefix2() {

        String[] input = {"dog","racecar","car"};

        String result = sut.longestCommonPrefix(input);
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefix3() {

        String[] input = {"cir","car"};


        String result = sut.longestCommonPrefix(input);
        assertEquals("c", result);
    }


}