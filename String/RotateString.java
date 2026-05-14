// Rotate String

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String doubled = s + s;

        return doubled.contains(goal);

    }
}


// Time complexity - O(n)
// Space complexity - O(n)
