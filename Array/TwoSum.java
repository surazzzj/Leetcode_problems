// Two Sum

// Brute Force Approach - 

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 2, 10, 3 };
        int target = 7;

        int[] result = twoSum(nums, target);
        System.err.println(result[0] + ", " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}

// Time complexity - O(n²)
// space complexity - O(1)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal Approach (HashMap) -

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 2, 10, 3 };
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}

// Time complexity - O(n)
// space complexity - O(n)