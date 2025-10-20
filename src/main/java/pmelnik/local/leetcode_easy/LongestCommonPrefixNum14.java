package pmelnik.local.leetcode_easy;

public class LongestCommonPrefixNum14 {

    //String[] input = {"flower","flow","flight"};
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int minWordMaxIndex = strs[0].length() - 1;
        int resultLength = 0;

        for (int  i = 1; i < strs.length; i++) {
            if (strs[i].length() - 1 < minWordMaxIndex) {
                minWordMaxIndex = strs[i].length() - 1;
            }
        }

        for (int j = 0; j <= minWordMaxIndex; j++) {
            char temp = strs[0].charAt(j);

            for (int x = 1; x < strs.length; x++) {

                if (strs[x].charAt(j) != temp) {
                    break;
                }

                if (x == strs.length - 1) {
                    resultLength++;
                }
            }
        }

        if (resultLength >= 1) {
            return strs[0].substring(0, resultLength);
        } else return "";
    }
}
