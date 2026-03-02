// Plus One

import java.util.Arrays;

public class Plus1 {
    public static void main(String[] args) {

        int[] digits = { 1, 2, 3 };

        System.out.println("Digits Array: " + Arrays.toString(plus1(digits)));

    }

    static int[] plus1(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        digits = newArr;
        return digits;

    }
}
