// Find the Index of the First Occurrence in a String

public class FindIndexofFirstOccurrenceInString {
    public static void main(String[] args) {
        
        String heystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(heystack, needle));

    }

    static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;

            while (j < needle.length() && (i + j) < haystack.length()) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                j = j + 1;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
