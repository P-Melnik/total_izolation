package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomainToIntegerNum13Test {

    RomainToIntegerNum13 sut = new RomainToIntegerNum13();

    @Test
    void romanToInt() {
        String input = "III";

        int res = sut.romanToInt(input);
        assertEquals(3, res);
    }

    @Test
    void romanToInt2() {
        String input = "IV";

        int res = sut.romanToInt(input);
        assertEquals(4, res);
    }

    @Test
    void romanToInt3() {
        String input = "LVIII";

        int res = sut.romanToInt(input);
        assertEquals(58, res);
    }
}