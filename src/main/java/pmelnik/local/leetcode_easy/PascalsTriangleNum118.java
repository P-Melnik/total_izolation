package pmelnik.local.leetcode_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * Анализ сложности
 * Время: O(n²), где n = numRows (сумма 1 + 2 + ... + n = n(n+1)/2 элементов)
 * Память: O(n²) для хранения результата
 */
public class PascalsTriangleNum118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        if (numRows == 1) {
            return triangle;
        }

        //генерируем остальные строки
        for (int row = 1; row < numRows; row++) {
            List<Integer> previousRow = triangle.get(row - 1);
            List<Integer> currentRow = new ArrayList<>();
            //первый элемент всегда 1
            currentRow.add(1);

            for (int i = 1; i < row; i++) {
                int sum = previousRow.get(i - 1) + previousRow.get(i);
                currentRow.add(sum);
            }

            //последний элемент всегда 1
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }
}
