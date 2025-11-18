package pmelnik.local.leetcode_easy;

public class AddBinaryNum67 {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Указатель для строки a
        int j = b.length() - 1; // Указатель для строки b
        int carry = 0;          // Перенос

        // Проходим обе строки с конца
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Добавляем цифру из a, если есть
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Конвертируем char в int
                i--;
            }

            // Добавляем цифру из b, если есть
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Конвертируем char в int
                j--;
            }

            // Вычисляем текущую цифру и перенос
            result.append(sum % 2); // Текущая цифра (0 или 1)
            carry = sum / 2;        // Перенос (0 или 1)
        }

        // Разворачиваем результат, так как добавляли с конца
        return result.reverse().toString();
    }

}
