// Minimum Size Subarray Sum

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {

        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        System.out.println("Min Length: " + minSubArraylen(nums, target));

    }

    static int minSubArraylen(int[] nums, int target) {

        int minDistance = Integer.MAX_VALUE;
        int left = 0, right = 0, runningSum = 0;

        while (right < nums.length) {
            runningSum += nums[right];
            while (runningSum >= target) {
                minDistance = Math.min(minDistance, right - left + 1);
                runningSum -= nums[left];
                left++;
            }
            right++;
        }

        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;

    }
}
