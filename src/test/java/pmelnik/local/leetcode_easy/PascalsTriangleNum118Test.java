package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleNum118Test {

    PascalsTriangleNum118 sut = new PascalsTriangleNum118();

    @Test
    void generate() {
        int input = 5;

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );

        var actual = sut.generate(input);

        assertEquals(expected, actual);
    }
}