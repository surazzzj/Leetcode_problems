// Three sum 

// efficient version -

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = { 2, -2, 0, 3, -3, 5 };

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return result;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)