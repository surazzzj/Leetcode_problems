// Reverse every word in a string -

// Optimal Approach -

public class ReverseEveryWordInAString {
    public static void main(String[] args) {
         String s = " welcome to the jungle ";
         System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
          s = s.trim();

          String[] words = s.split("\\s+");
          StringBuilder result = new StringBuilder();

          for(int i=words.length-1; i>=0; i--) {
            result.append(words[i]);

            if(i != 0) result.append(" ");
          }

          return result.toString();
    } 
}

// Time complexity - O(n)
// Space complexity - O(n)



