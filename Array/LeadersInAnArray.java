// Leaders in an Array

// Brute Force Approach - 

// import java.util.*;;

// public class LeadersInAnArray {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 5, 3, 1, 2 };
//         System.out.println(findLeaders(nums));
//     }

//     public static List<Integer> findLeaders(int[] nums) {
//         List<Integer> leaders = new ArrayList<>();

//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             boolean isLeader = true;

//             for (int j = i + 1; j < n; j++) {
//                 if (nums[j] >= nums[i]) {
//                     isLeader = false;
//                     break;
//                 }
//             }

//             if (isLeader) {
//                 leaders.add(nums[i]);
//             }
//         }

//         return leaders;
//     }
// }

// Time complexity - O(n²) 
// Space complexity - O(n)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal Approach -

import java.util.*;;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };
        System.out.println(findLeaders(nums));
    }

    public static List<Integer> findLeaders(int[] nums) {

        List<Integer> leaders = new ArrayList<>();

        int n = nums.length;
        int maxRight = nums[n - 1];

        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(leaders);

        return leaders;

    }
}

// Time complexity - O(n)
// Space complexity - O(n)