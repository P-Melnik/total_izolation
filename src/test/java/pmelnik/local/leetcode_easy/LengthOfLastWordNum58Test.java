package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordNum58Test {

    LengthOfLastWordNum58 sut = new LengthOfLastWordNum58();

    @Test
    void lengthOfLastWord() {
        String input = "Hello world";

        int res = sut.lengthOfLastWord(input);
        assertEquals(5, res);
    }

    @Test
    void lengthOfLastWordSpacesAfter() {
        String input = "Hello world test  ";

        int res = sut.lengthOfLastWord(input);
        assertEquals(4, res);
    }

}