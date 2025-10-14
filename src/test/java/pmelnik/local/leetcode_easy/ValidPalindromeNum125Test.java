package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeNum125Test {

    ValidPalindromeNum125 sut = new ValidPalindromeNum125();

    @Test
    void isPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        boolean expect = true;

        boolean result = sut.isPalindrome(input);

        assertEquals(expect, result);
    }

    @Test
    void isPalindrome2() {
        String input = "race a car";
        boolean expect = false;

        boolean result = sut.isPalindrome(input);

        assertEquals(expect, result);
    }

    @Test
    void isPalindrome3() {
        String input = " ";
        boolean expect = true;

        boolean result = sut.isPalindrome(input);

        assertEquals(expect, result);
    }


}