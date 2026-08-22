// Sort Array By Parity

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {

        int[] nums = { 3, 1, 2, 4 };

        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));

    }

    static int[] sortArrayByParity(int[] arr) {

        int[] res = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res[j] = arr[i];
                j++;
            }
        }

        return res;

    }

}


// Time complexity - 0(n)
// Space complexity - 0(n)
