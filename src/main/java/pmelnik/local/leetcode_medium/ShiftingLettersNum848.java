package pmelnik.local.leetcode_medium;

public class ShiftingLettersNum848 {

    //Решение с O(n)
    public String shiftingLetters(String s, int[] shifts) {
        char[] res = new char[s.length()];
        long shift = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            shift += shifts[i];
            int newChar = (s.charAt(i) - 'a' + (int)(shift % 26)) % 26;
            res[i] = (char)('a' + newChar);
        }
        return new String(res);
    }

}
