// Union of two sorted arrays

// Brute force - not optimal

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = { 3, 4, 6, 7, 9, 9 };
        int[] nums2 = { 1, 5, 7, 8, 8 };

        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for (int num : list) {
            System.err.print(num + " ");
        }
    }
}

// Time complexity - O((n + m) log(n + m)) (due to sorting)
// Space complexity - O(n + m)




/*----------------------------------------------------------------------------------------------------------------------------------------- */




// Optimal Approach -

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 6, 7, 9, 9 };
        int[] nums2 = { 1, 5, 7, 8, 8 };

        ArrayList<Integer> result = union(nums1, nums2);
        System.out.println(result);
    }

    public static ArrayList<Integer> union(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != nums2[j]) {
                    result.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < nums1.length) {
            if (result.size() == 0 || result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (result.size() == 0 || result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }

        return result;
    }
}


// Time complexity - O(n + m) (best possible)
// Space complexity - O(n + m) (for result)