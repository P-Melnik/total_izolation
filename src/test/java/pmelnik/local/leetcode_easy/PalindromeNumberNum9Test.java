package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberNum9Test {

    PalindromeNumberNum9 sut = new PalindromeNumberNum9();

    @Test
    void isPalindrome() {
        int input = 121;
        boolean res = sut.isPalindrome(input);
        assertTrue(res);
    }
}