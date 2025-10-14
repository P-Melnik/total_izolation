package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftingLettersNum848Test {

    ShiftingLettersNum848 sut = new ShiftingLettersNum848();

    @Test
    void shiftingLetters() {
        String input = "abc";
        int[] shifts = {3, 5, 9};

        String res = sut.shiftingLetters(input, shifts);

        assertEquals("rpl", res
        );
    }

}