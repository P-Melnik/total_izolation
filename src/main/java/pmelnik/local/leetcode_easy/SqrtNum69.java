package pmelnik.local.leetcode_easy;

/**
 * Краткое описание решения
 * Используем бинарный поиск для нахождения целочисленного квадратного корня.
 * Ищем число mid такое, что mid² ≤ x < (mid+1)².
 * Анализ сложности
 * Время: O(log x) - классический бинарный поиск
 * Память: O(1) - только константная дополнительная память
 */
public class SqrtNum69 {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

}
