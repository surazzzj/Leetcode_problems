// Remove Outermost Parentheses -

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "()(()())(())";
        System.out.println(removeOuterParanthesis(s));
    }

    public static String removeOuterParanthesis(String s) {
         StringBuilder result = new StringBuilder();

         int open = 0;

         for(char ch: s.toCharArray()) {
            if(ch == '(') {
                if(open > 0) result.append(ch);
                open++;
            } else {
                open--;
                if(open > 0) result.append(ch);
            }
         }

         return result.toString();
    }
}


// Time complexity - O(n)
// Space complexity - O(1)
