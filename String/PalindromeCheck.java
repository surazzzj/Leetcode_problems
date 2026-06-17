public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}

// Time: O(n)
// Space: O(1)