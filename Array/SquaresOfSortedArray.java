// Squares of a Sorted Array

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        int[] nums = { -4, -1, 0, 3, 10 };

        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i] * nums[i];
        }

        Arrays.sort(res);

        System.out.print("Rotated array: [");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
