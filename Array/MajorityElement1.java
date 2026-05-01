// Majority Element-I

// Brute Force Approach -

public class MajorityElement1 {
    public static void main(String[] args) {

        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        System.err.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)

/*-------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal (Boyer–Moore Voting Algorithm) -

public class MajorityElement1 {
    public static void main(String[] args) {
        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        System.err.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

// Time complexity - O(n)
// Space complexity - O(1)