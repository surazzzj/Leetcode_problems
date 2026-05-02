// Rearrange array elements by sign

// Brute Force Approach - 

import java.util.*;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, -1, -3, -4 };
        System.out.println(Arrays.toString(rearrange(nums)));
    }

    public static int[] rearrange(int[] nums) {
        int n = nums.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int[] result = new int[n];
        int i = 0;

        for (int j = 0; j < n / 2; j++) {
            result[i++] = pos.get(j);
            result[i++] = neg.get(j);
        }

        return result;
    }
}

// Time complexity - O(n)
// Space complexity - O(n)

/*------------------------------------------------------------------------------------------------------------------------------------ */

// Optimal Approach -

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, -1, -3, -4 };
        System.out.println(Arrays.toString(rearrange(nums)));
    }

    public static int[] rearrange(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}
