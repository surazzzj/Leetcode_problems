// Two Sum

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] resultIndices = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultIndices[0] = i;
                    resultIndices[1] = j;
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (found) {
            System.out.println("Result indices: [" + resultIndices[0] + ", " + resultIndices[1] + "]");
        } else {
            System.out.println("No two numbers add up to target");
        }
    }
}