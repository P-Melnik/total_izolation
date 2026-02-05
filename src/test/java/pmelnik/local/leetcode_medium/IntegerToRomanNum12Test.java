package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanNum12Test {

    IntegerToRomanNum12 sut = new IntegerToRomanNum12();

    @Test
    void intToRoman_3749() {
        int input = 3749;
        String result = "MMMDCCXLIX";

        String actualResult = sut.intToRoman(input);

        assertEquals(result, actualResult);
    }

    @Test
    void intToRoman_58() {
        int input = 58;
        String result = "LVIII";

        String actualResult = sut.intToRoman(input);

        assertEquals(result, actualResult);
    }

    @Test
    void intToRoman_1994() {
        int input = 1994;
        String result = "MCMXCIV";

        String actualResult = sut.intToRoman(input);

        assertEquals(result, actualResult);
    }
}