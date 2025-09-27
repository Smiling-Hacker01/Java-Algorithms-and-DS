//code to find the max sum of k array elements here for the ques the k is given 3. 
public class MaxSumOfKArrayElements {
    public static int findMaxSum(int[]nums, int k){
         if (nums == null || nums.length == 0) {
            return -1;
         }
         int left = 0;
         int right = k-1;
         int length = nums.length;
         int maxSum = 0;
         int currentSum = 0;
         for(int i = left; i <= right; i++){
             currentSum += nums[i];
         }
         maxSum = currentSum;
         while (right <= length-k ) {
            currentSum -= nums[left];
            left++;
            right++;
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);
         }
         return maxSum;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {2,3,4,5};
        int k = 2;
        int result = findMaxSum(nums, k);
        System.out.println(result);
    }
}
