//code is to left rotate an array with k places without using an extra space
public class RotateArrayLeftOptimized {
    //function to reverse an array
    public static void reverse(int[]nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    //function to rotate an array
    public static void rotate(int[]nums, int k){
        int n = nums.length;
        k = k % n;
        
        //first reverse the k elements 
        reverse(nums, 0, k-1);
        //reverse remaining elements
        reverse(nums, k, n-1);
        //reverse the whole array
        reverse(nums, 0, n-1);
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
