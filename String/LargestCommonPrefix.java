// Longest Common Prefix

public class LargestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));

    }

    static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char currChar = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currChar) {
                    return first.substring(0, i);
                }
            }

        }

        return first;
    }

}

// Time complexity - O(n * m)
// Space complexity - O(1)






// optimal approach - 

import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(lcp(strs));

    }

    public static String lcp(String[] str) {

        if (str == null || str.length == 0) {
            return " ";
        }

        if (str.length == 1) {
            return str[0];
        }

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return first.substring(0, i);

    }
}