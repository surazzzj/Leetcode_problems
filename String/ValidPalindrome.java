// Valid Palindrome

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + isPalindrome(s));

    }

    static boolean isAlphanumericCharacter(char c) {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9');
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (!isAlphanumericCharacter(c1)) {
                i = i + 1;
                continue;
            }

            if (!isAlphanumericCharacter(c2)) {
                j = j - 1;
                continue;
            }

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }

            i = i + 1;
            j = j - 1;
        }

        return true;

    }
}
