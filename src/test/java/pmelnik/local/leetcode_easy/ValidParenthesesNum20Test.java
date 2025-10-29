package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesNum20Test {

    ValidParenthesesNum20 sut = new ValidParenthesesNum20();

    @Test
    void isValidTrue() {
        String input = "()";

        boolean res = sut.isValid(input);
        assertTrue(res);
    }

    @Test
    void isValidTrue2() {
        String input = "()[]()[][{()()}]";

        boolean res = sut.isValid(input);
        assertTrue(res);
    }

    @Test
    void isValidTrue3() {
        String input = "((((([[[{}]]])))))";

        boolean res = sut.isValid(input);
        assertTrue(res);
    }

    @Test
    void isValidFalse() {
        String input = "(}{)";

        boolean res = sut.isValid(input);
        assertTrue(res);
    }

    @Test
    void isValidFalse2() {
        String input = "([][][})";

        boolean res = sut.isValid(input);
        assertTrue(res);
    }


}