// Third Maximum Number

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {

        int[] nums = { 2, 2, 3, 1 };
        System.out.println("Third maximum number: " + thirdMax(nums));

    }

    static int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int i = 0,
                j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        int elemCount = 0;

        for (int k = 1; k < nums.length; k++) {
            if (nums[k] != nums[k]) {
                elemCount++;
            }
            if (elemCount == 3) {
                return nums[k];
            }
        }

        return nums[0];

    }
}