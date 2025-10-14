package pmelnik.local.leetcode_easy;

/**
 * Time O(n)
 * Space O(1) in-place solution
 * Используем два указателя: один начинает с начала строки, другой - с конца.
 * Двигаем их навстречу друг другу, пропуская не-буквенные символы и
 * сравнивая символы в нижнем регистре.
 */
public class ValidPalindromeNum125 {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // пропускаем не буквенные и не цифровые символы слева и затем справа
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}
