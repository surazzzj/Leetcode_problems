//  Merge Sorted Array

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        
        int m = 3;  // Number of actual elements in nums1
        int n = 3;  // Number of elements in nums2
        
        merge(nums1, m, nums2, n);
        
        // Print the result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: 1 2 2 3 5 6
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;      // Last actual element in nums1
        int p2 = n - 1;      // Last element in nums2
        int p = m + n - 1;   // Last position in nums1 array
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}