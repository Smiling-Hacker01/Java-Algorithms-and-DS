//code is to find the length of the sub array whose sum is less than or equal to k (here k is given 14) we can also take it from the user as per our requirements
public class SubArraySum {
    public static int longestSubArray(int[]nums, int k){
        if (nums.length < 1) {
            return -1;
        }
        int left = 0;
        int right;
        int n = nums.length-1;
        int maxLength = 0;
        int currentSum = 0;
        for(right = 0; right <= n; right++ ){
            currentSum += nums[right];
            while (currentSum > k) {
                currentSum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right-left + 1);
        }
        return maxLength;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {2,5,1,7,10};
        int k = 14;
        int result = longestSubArray(nums, k);
        System.out.println(result);
    }
}

