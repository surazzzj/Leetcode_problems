// Single Number

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };

        int res = 0;

        for (int num : nums) {
            res = res ^ num;
        }

        System.out.println(res);
    }
}