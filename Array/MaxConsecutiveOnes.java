// Max Consecutive Ones

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] nums = { 1, 0, 1, 1, 0, 1 };

        int count = 0,
                max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        System.out.println(Math.max(max, count));

    }
}
