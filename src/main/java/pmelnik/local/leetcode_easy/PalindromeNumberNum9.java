package pmelnik.local.leetcode_easy;

/**
 * Time O(n)
 * Space O(1)
 */
public class PalindromeNumberNum9 {

    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
