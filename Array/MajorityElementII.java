// MajorityElement-II

// Using HashMap (not optimal)

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2, 2 };
        System.out.println(majorityElement(nums));

    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }

        return result;
    }
}

// Time complexity - O(n)
// Space complexity - O(n)

/*----------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal (Boyer–Moore Voting) -

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2, 2 };
        System.out.println(majorityElement(nums));

    }

    public static List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        for (int num : nums) {
            if (candidate1 == num)
                count1++;
            else if (candidate2 == num)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num: nums) {
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();

        if(count1 > nums.length / 3) result.add(candidate1);
        if(count2 > nums.length / 3) result.add(candidate2);

        return result;
    }
}

// Time complexity - O(n)
// Space complexity - O(1)