// Count subarrays with given sum

// Brute force - 

public class CountSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.println(countSubarrays(nums, k));
    }

    public static int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k)
                    count++;
            }
        }

        return count;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)

/*----------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal solution - 

import java.util.*;

public class CountSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.println(countSubarrays(nums, k));
    }

    public static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0, prefixSum = 0;

        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

// Time complexity - O(n)
// Space complexity - O(n)