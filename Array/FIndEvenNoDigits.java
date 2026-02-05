// Find Numbers with Even Number of Digits

public class FIndEvenNoDigits {
    public static void main(String[] args) {

        int[] nums = { 12, 345, 2, 6, 7896 };

        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digitCount = 0;

            while (num != 0) {
                num = num / 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("even count: " + evenCount);

    }
}
