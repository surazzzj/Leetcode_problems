/// Sort Characters by Frequency -

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static List<Character> frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if (map.get(b) != map.get(a))
                return map.get(b) - map.get(a);

            return a - b;
        });

        return list;
    }   
}


// Time complexity - O(n + k log k)
// SPace complexity - O(k)
