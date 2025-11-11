package pmelnik.local.leetcode_easy;

/**
 * Количество способов подняться на n ступенек
 * равно количеству способов подняться на (n-1) ступенек
 * (и сделать шаг 1) плюс количество способов подняться на (n-2) ступенек
 * (и сделать шаг 2). Это числа Фибоначчи.
 * -----
 * Анализ сложности
 * Время: O(n) - один проход от 2 до n
 * Память: O(1) - только константная дополнительная память
 */
public class ClimbingStairsNum70 {

    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1; // dp[i-1]
        int prev2 = 1; // dp[i-2]
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    // также присутсвует рекурсивное решение для Фибоначчи
    // однако оно не является оптимальным
    public int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}
