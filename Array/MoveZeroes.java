public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j = j + 1;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j = j + 1;
        }

        System.out.print("Array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
