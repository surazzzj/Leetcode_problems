// Squares of a Sorted Array

class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] resultArr = square(nums);

        System.out.print("Sorted squares: [");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]);
            if (i < resultArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] square(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;

        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[k] = nums[left] * nums[left];
                left++;
            } else {
                result[k] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}

// Time complexity - 0(n)
// Space complexity - 0(n)