
import java.util.Arrays;

public class ReplaceElementWithGreatestInRight {
    public static void main(String[] args) {
        
    int[] arr = {17, 18, 5, 4, 6, 1};

    int[] res = replaceElem(arr);
    System.out.println(Arrays.toString(res));

    }

    static int[] replaceElem(int[] arr) {

         int max = -1;

         for(int i=arr.length-1; i>=0; i--) {
         int temp = arr[i];
         arr[i] = max;
         max = Math.max(max, temp);
         }

         return arr;

    }
}
