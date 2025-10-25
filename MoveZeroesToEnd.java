//code is to move all zeroes to end of the array without using an extra space
public class MoveZeroesToEnd{
    public static void moveZeroes(int[]nums){
        int start = 0;
        int write = 0;
        while (start < nums.length) { 
            if (nums[start] == 0) {
                 start++;
            }
            else if (nums[start] != 0){
                nums[write] = nums[start];
                write++;
                start++;
            }
        }
        while (write < nums.length) {
              nums[write] = 0;
              write++;
        }
    }
//main function
   public static void main(String[] args) {
       int[]nums = {0,1,0,3,12};
       moveZeroes(nums);
       for (int i : nums) {
            System.out.print(i + " ");
       }
   }
}