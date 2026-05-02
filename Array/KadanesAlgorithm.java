// find the subarray with the largest sum

// Brute Force Approach -

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4 };
        System.out.println(maxSubarraySum(nums));
    }

    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)

/*----------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal (Kadane’s Algorithm) -

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4 };
        System.out.println(maxSubarraySum(nums));
    }

    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

// Time complexity - O(n)
// Space complexity - O(1)
