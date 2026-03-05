// Reverse String

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Reversed String: " + Arrays.toString(reverseString(str)));

    }

    static char[] reverseString(char[] str) {

        int left = 0, right = str.length - 1;

        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        return str;

    }
}