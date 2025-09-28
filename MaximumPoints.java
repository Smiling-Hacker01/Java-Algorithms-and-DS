//ques is to find the maximum points we can opbtain by picking the cards either from the front or back the maximum card we can puck at a time is (k) which is given 4
public class MaximumPoints{
    public static int maxPoint(int[]nums, int k ){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        int length = nums.length;
        for(int i = 0 ; i < k; i++){
           leftSum += nums[i];
        }
        maxSum = leftSum;
        rightSum = length-1;
        for(int j = k-1; j >=0 ; j--){
          leftSum -= nums[j];
          leftSum += nums[rightSum];
          rightSum--;
          maxSum = Math.max(maxSum, leftSum);
        }
        return maxSum;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int result = maxPoint(nums, k);
        System.out.println(result);
    }
}