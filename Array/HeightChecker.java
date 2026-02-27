// Height Checker

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

        int[] heights = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));

    }

    static int heightChecker(int[] heights) {
        Integer[] res = new Integer[heights.length];

        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }

        Arrays.sort(res);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != res[i]) {
                count++;
            }
        }

        return count;
    }
}
