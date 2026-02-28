// Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindNumbersDisappearedInArray {
    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Disappeared Numbers: " + findDissapearedNumber(nums));

    }

    static List<Integer> findDissapearedNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            set.add(val);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;

    }
}