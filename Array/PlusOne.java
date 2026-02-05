// Plus One

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = { 9 };

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;

        System.out.print("[");
        for (int p = 0; p < res.length; p++) {
            System.out.print(res[p]);
            if (p < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
