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

            for (int j = 1; j < strs.length - 1; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currChar) {
                    return first.substring(0, i);
                }
            }

        }

        return first;
    }

}