//code is to find the max consecutive ones ||| if we have two flip two zeroes solved using sliding window or two pointer approach
public class MaxConsecutiveOnes3{
    public static int maxcount(int[]nums, int k){
        int maxLength = 0;
        int right = 0;
        int left = 0;
        int countZeroes = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                countZeroes++;
            }
            if (countZeroes > k) {
                if (nums[left] == 0) {
                    countZeroes--;
                }
                left++;
            }
            if (countZeroes <= k) {
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
            right++;
        }
      return maxLength;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = maxcount(nums, k );
        System.out.println("Max consecutive ones in a array if we flip " + k + " zeroes => " + result);
    }
}