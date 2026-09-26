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





// Using HashMap - 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "Listen!";
        String t = "!Silent";

        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Subtract characters from t
        for (char c : t.toCharArray()) {

            if (!freq.containsKey(c)) {
                return false;
            }

            freq.put(c, freq.get(c) - 1);

            if (freq.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}