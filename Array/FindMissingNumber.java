// Find missing number

// Brute force -

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 1, 4 };
        System.out.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }
}

// Time complexity - O(n²)
// Space complexity - 0(1)

/*--------------------------------------------------------------------------------------------------------------------------------------- */

// Better Approach -

import java.util.*;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 1, 4 };
        System.err.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}

// Time complexity - O(n)
// Space complexity - 0(n) (extra space)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal (XOR Approach) -

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 1, 4 };
        System.err.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {
        int n = nums.length;

        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        return xor;

    }
}

// Time complexity - O(n)
// Space complexity - 0(1)
