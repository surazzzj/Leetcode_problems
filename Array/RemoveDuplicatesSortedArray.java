// Remove Duplicates from Sorted Array

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }

    }

}