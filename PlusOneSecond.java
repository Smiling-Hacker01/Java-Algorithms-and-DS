public class PlusOneSecond{
    public static int[] plusOne(int[]nums){
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
               if (nums[i] < 9) {
                   nums[i]++;
                   return nums;
               }
             nums[i] = 0;
        }
        int newNumber[] = new int[n+1];
        newNumber[0] = 1;
        return newNumber; 
    }
    //main function
    public static void main(String[] args) {
        int[]num = {9,9,9};
        int[]result = plusOne(num);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}