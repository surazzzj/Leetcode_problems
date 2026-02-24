// Check if N and its Double Exist

import java.util.HashSet;

public class CheckNAndItsDoubleExists {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 5, 3 };

        System.out.println(ifExist(nums));
    }

    public static boolean ifExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(2 * num) || set.contains(num / 2) && (num % 2 == 0)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
