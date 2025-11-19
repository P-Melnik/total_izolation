package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import static org.junit.jupiter.api.Assertions.*;

class SqrtNum69Test {

    SqrtNum69 sut = new SqrtNum69();

    @Test
    void mySqrt4() {
        int input = 4;

        int res = sut.mySqrt(input);
        assertEquals(2, res);
    }

    @Test
    void mySqrt8() {
        int input = 8;

        int res = sut.mySqrt(input);
        assertEquals(2, res);
    }

    @Test
    void mySqrt16() {
        int input = 16;

        int res = sut.mySqrt(input);
        assertEquals(4, res);
    }
}