//code is to rotate array right without using an extra space
public class RotateArrayRightKPlacesOptimized {
    public static void reverse(int[]nums, int start, int end){
        while (start < end) { 
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
   // rotate array function
   public static void rotateArray(int[]nums, int k){
       int n =  nums.length;
       k = k % n;
     
       //first reverse the whole array
       reverse(nums, 0, n-1);
       //reverse the first k elements
       reverse(nums, 0, k-1);
       //reverse the remaining n-1 elements
       reverse(nums, k, n-1);


    //    //first reverse the kth elements that we need to rotate
    //    reverse(nums, 0, k-1);
    //    //now reverse the remaining part of the array            // follow this approach if you have to rotate array from left
    //    reverse(nums,k, n-1);
    //    //Then reverse the whole array
    //    reverse(nums, 0, n -1);
   }

   //main function
   public static void main(String[] args) {
       int[]nums = {1,2,3,4,5,6,7};
       int k = 2;
       rotateArray(nums, k);
       for (int i : nums) {
        System.out.print(i + " ");
       }
   }
}
