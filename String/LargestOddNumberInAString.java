// Largest Odd Number in a String

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String s = "0214638";
        System.out.println(largestOddNumber(s));
    }

    public static String largestOddNumber(String s) {
        for(int i=s.length()-1; i>=0; i--) {
               char ch = s.charAt(i);
               int digit = ch - '0';

               if(digit % 2 != 0) return s.substring(0, i+1);
        }

        return "";
    }
}

// Time complexity - O(n)
// Space complexity - O(n)