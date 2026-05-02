// Best Time to Buy and Sell Stock

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 5, 8, 11, 9 };
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] nums) {
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int profit = nums[j] - nums[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}

// Time complexity - O(n²)
// Space complexity - O(1)

/*---------------------------------------------------------------------------------------------------------------------------------------- */

// Optimal Approach -

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = { 10, 7, 5, 8, 11, 9 };
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }

            int profit = nums[i] - minPrice; // profit = selling price - buy price

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

// Time complexity - O(n) (best)
// Space complexity - O(1)