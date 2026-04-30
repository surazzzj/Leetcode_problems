// Longest subarray with sum K

// Brute Force Approach -

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}

// Time complexity - O(n²) (quadratic time)
// space complexity - O(1)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Better / Optimal Approach (Prefix Sum + HashMap)

import java.util.*;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: if sum itself is k
            if (sum == k) {
                maxLength = i + 1;
            }

            // Case 2: check if (sum - k) exists
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLength = Math.max(maxLength, len);
            }

            // Store prefix sum (only first occurrence)
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}

// Time complexity - O(n)
// space complexity - O(n) (extra space - map)

/*-------------------------------------------------------------------------------------------------------------------------------------- */

// Sliding Window (for positive only) -

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
        int left = 0, sum = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}

// Time complexity - O(n)
// space complexity - O(1)