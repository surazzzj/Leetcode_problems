// Intersection Of Two Arrays II

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {

        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i = i + 1;
                j = j + 1;
            } else if (nums1[i] > nums2[j]) {
                j = j + 1;
            } else {
                i = i + 1;
            }
        }

        // Convert ArrayList to array
        int[] res = new int[list.size()];
        for (int p = 0; p < res.length; p++) {
            res[p] = list.get(p);
        }

        System.out.print("[");
        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p]);
            if (p < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
