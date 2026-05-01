// Sort an array of 0's 1's and 2's

// Brute Force (Sorting) -

import java.util.Arrays;

public class SortAnArrayOf01And2 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };

        Arrays.sort(nums);

        System.err.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.err.print(nums[i]);
            } else {
                System.err.print(nums[i] + ", ");
            }
        }
        System.err.print("]");
    }
}

// Time complexity - O(n log n)
// Space complexity - O(1)

/*----------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal Approach (Dutch National Flag)

public class SortAnArrayOf01And2 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        for (int num : nums) {
            System.err.print(num + " ");
        }
    }
}

// Time complexity - O(n)
// Space complexity - O(1)