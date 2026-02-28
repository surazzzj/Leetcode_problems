// Find Pivot Index

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println("Pivot Index: " + pivotIndex(nums));

    }

    static int pivotIndex(int[] nums) {

        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }

        return -1;

    }
}
