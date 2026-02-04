// Intersection of Two Arrays

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            s2.add(num);
        }

        // Intersection
        Set<Integer> intersection = new HashSet<>();

        for (int num : s1) {
            if (s2.contains(num)) {
                intersection.add(num);
            }
        }

        int[] res = new int[intersection.size()];
        int k = 0;
        for (int num : intersection) {
            res[k] = num;
            k = k + 1;
        }

        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
