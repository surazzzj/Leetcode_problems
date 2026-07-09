
import java.util.*;

// Contains Duplicate

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };

        System.out.print(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

// Optimal approach -

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.print(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num))
                return true;

            set.add(num);
        }

        return false;
    }
}

// time complexity - 0(n)
// space complexity - 0(n)