// Remove Duplicates from Sorted Array

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int k = 1;                                     // counts number of unique elements

        for (int i = 1; i < nums.length; i++) {        // loop starts from 1 because, first element always unique
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}

// Time complexity - O(N)   using single traversal
// Space complexity - O(1)   in place - No extra space

/*------------------------------------------------------------------------------------------------------------------------------------------ */

// Remove Duplicates from Unsorted Array

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {

    public static void main(String[] args) {

        int[] nums = { 3, 1, 2, 3, 2, 1 };

        HashSet<Integer> set = new HashSet<>();

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}


// Time complexity - O(N)
// Space complexity - O(N)   (extra space for HashSet)




/* --------------------------------------------------------------------------------------------------------------------------------------- */




// Approach 2:

import java.util.Arrays;

public class RemoveDuplicatesUnsorted {

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 3, 2, 1};

        Arrays.sort(nums);

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}

// Time: O(n log n) (sorting cost)
// Space: O(1) (if sorting in-place)