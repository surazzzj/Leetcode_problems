// Check if the Array is Sorted II

// Brute Force Approach -
public class CheckIfArrayIsSortedII {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 6, 8, 5, 4, 0 };
        System.out.println(isSorted(nums));

    }

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)



/* -------------------------------------------------------------------------------------------------------------------------------------- */



// Optimal solution -

public class CheckIfArrayIsSortedII {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 6, 8, 5, 4, 0 };

        System.out.println(isSorted(nums));
    }

    static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

// Time complexity - O(n)
// Space complexity - O(1)