// Largest Number At Least Twice of Others

public class LargestNumberTwiceOfOthers {
    public static void main(String[] args) {

        int[] nums = { 3, 6, 1, 0 };
        System.out.println(dominantIndex(nums));

    }

    static int dominantIndex(int[] nums) {
        int max1 = -1;
        int max2 = -1;
        int idx = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;
            } else if(nums[i] > max2){
                max2 = nums[i];
            }
        }

        return (max1 >= (2 * max2) ? idx : -1);
    }
}
