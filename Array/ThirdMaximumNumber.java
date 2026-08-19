// Third Maximum Number

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3};
        
        System.out.println(thirdMax(arr));
            
    }
    
    public static int thirdMax(int[] arr) {
        
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(long num: arr) {
            
            if(num == first || num == second || num == third) {
                continue;
            }
            
            if(num > first) {
                third = second;
                second = first;
                first = num;
            } else if(num > second) {
                third = second;
                second = num;
            } else if(num > third) {
                third = num;
            }
        }
        
        return third == Long.MIN_VALUE ? (int) first : (int) third;
        
    }
}