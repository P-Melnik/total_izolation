package pmelnik.local.leetcode_medium;

public class ReverseIntegerNum7 {

    public int reverse(int x) {

        int result = 0;

        while (x != 0) {
            int digit = x % 10; // Получаем последнюю цифру
            x /= 10;           // Убираем последнюю цифру

            // Проверка переполнения ДО добавления новой цифры

            // Для положительных чисел
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Для отрицательных чисел
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Добавляем цифру к результату
            result = result * 10 + digit;
        }

        return result;
    }
}
