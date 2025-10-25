//code is to find the duplicate number in an array and also the missing number
public class findMissingNum {
     public static int[] findErrorNums(int[] nums){
         int n = nums.length;
         int totalSum = (n * (n + 1))/ 2;
         int repeatedNum = 0;
         int actualSum = 0;
         for (int i = 0; i < n; i++) {
             if( i > 0 && nums[i] == nums[i-1]) repeatedNum = nums[i];
              actualSum += nums[i];
         }
         int missingValue = (totalSum + repeatedNum ) - actualSum;
         return new int[]{repeatedNum, missingValue};
     }
     //main function
     public static void main(String[] args) {
         int[]nums = {1,2,2,4,5};
         int[]result = findErrorNums(nums);
         for (int i : result) {
            System.out.print(i + " ");
         }
     }
}
