// First Unique Character in a String

import java.util.*;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {

        String str = "leetcode";

        System.out.println(firstUniqueChar(str));

    }

    static int firstUniqueChar(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }
}
