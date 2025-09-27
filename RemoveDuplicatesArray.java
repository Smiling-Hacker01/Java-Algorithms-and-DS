//ques Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] nums){
        if (nums.length <= 2) {
            return nums.length;
        }
        int k = 2;
        for(int i = 2; i < nums.length; i++){
             if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
             }
        }
        return k;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {1,1,1,2,2,3};
        int result = removeDuplicates(nums);
        for(int i = 0 ; i < result; i++){
           System.out.print(nums[i] + " ");
        }
    }
    
}
