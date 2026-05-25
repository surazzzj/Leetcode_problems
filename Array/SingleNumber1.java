
// Single Number 1 - Find the number that appears once, and other numbers twice.

// Brute force - 

public class SingleNumber1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        System.out.println(findSingle(nums));
    }

    public static int findSingle(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}

// Time complexity - O(n²) 
// Space complexity - O(1)

/*----------------------------------------------------------------------------------------------------------------------------------------- */

// Better Approach (HashMap) -

import java.util.*;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        System.out.println(findSingle(nums));
    }

    public static int findSingle(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: nums) {
            if(map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}

// Time complexity - O(n) 
// Space complexity - O(n)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal Approach (XOR Trick)

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 3, 1, 4 };
        System.err.println(findSingle(nums));
    }

    public static int findSingle(int[] nums) {
        int xor = 0;

        for(int num: nums) {
            xor ^= num;
        }

        return xor;
    }
}


// Time complexity - O(n) 
// Space complexity - O(1)