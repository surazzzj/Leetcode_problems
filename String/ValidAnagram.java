public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx] = freq[idx] + 1;
        }

        for (char c : t.toCharArray()) {
            int idx = c - 'a';
            freq[idx] = freq[idx] - 1;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
