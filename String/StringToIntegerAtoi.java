// String to Integer (atoi)

public class StringToIntegerAtoi {
    public static void main(String[] args) {

        String s = "  -042";
        System.out.println(myAtoi(s));

    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    static int myAtoi(String s) {

        int i = 0, num = 0, sign = 1;

        // step - 1 handle whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i = i + 1;
        }

        // step - 2 handle signedness
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i = i + 1;
            } else if (s.charAt(i) == '+') {
                i = i + 1;
            }
        }

        // step - 3 conversion
        while (i < s.length() && isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (num == Integer.MAX_VALUE / 10) {
                if (sign == 1) {
                    if (digit >= 7) {
                        return Integer.MAX_VALUE;
                    }
                } else if (sign == -1) {
                    if (digit >= 8) {
                        return Integer.MIN_VALUE;
                    }
                }
            }

            // step - 4 rounding
            if (num > Integer.MAX_VALUE / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i = i + 1;
        }

        return sign * num;

    }
}
