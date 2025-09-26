//code is to commute the perfect trio to form a triangle that means we need two sides that is greater than the third one to form a triangle at last we need to return the number of pairs present in the array to form a triangle

import java.util.Arrays;

public class ValidTriangleNumber {
    public static int numPairs(int[] nums){
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
       for(int k = n-1; k >= 2; k--){
        int left = 0;
        int right = k-1;
        while (left < right) {
            if (nums[left] + nums[right] > nums[k]) {
                count += (right - left);
                right--;
            }else{
                left++;
            }
        }

       }
        return count;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {4,2,3,4};
        int result = numPairs(nums);
        System.out.println("Number of pairs present to form a triangle in an array is -> " + result);
    }
}
