//code is to remove duplicates in a sorted array without using an extra space
public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int[]nums){
        if (nums.length <= 0) {
            return -1;
        }
        int left = 0;
        for(int right = 1; right < nums.length; right++){
                if (nums[right] != nums[left]) {
                    left++;
                    nums[left] = nums[right];
                }
        }
        return  left+1; // +1 because of 0 based indexing
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {10,10,20,30,30,40,50};
        int result = removeDuplicates(nums);
        for(int i = 0 ; i < result; i++){
               System.out.print(nums[i] + " ");
        }
    }
}
