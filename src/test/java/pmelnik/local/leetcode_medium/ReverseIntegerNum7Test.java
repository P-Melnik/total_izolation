package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerNum7Test {

    ReverseIntegerNum7 sut = new ReverseIntegerNum7();

    @Test
    void reverse_1() {
        var input = 123;
        int res = sut.reverse(input);

        assertEquals(321, res);
    }

    @Test
    void reverse_2() {
        var input = -123;
        int res = sut.reverse(input);

        assertEquals(-321, res);
    }

    @Test
    void reverse_3() {
        var input = 120;
        int res = sut.reverse(input);

        assertEquals(21, res);
    }

}