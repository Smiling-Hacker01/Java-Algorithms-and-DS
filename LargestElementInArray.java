//simple array problem to find the largest element in an array
public class LargestElementInArray {
    public static int findLargest(int[]nums){
        int left = 0;
        int right = nums.length-1;
        int largest = 0;
        while (left < right) { 
            if (nums[left] > nums[right]) {
                largest = nums[left];
                right--;
            }else{
                largest = nums[right];
                left++;
            }
        }
        return  largest;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,90,8,97,56};
        int result = findLargest(nums);
        System.out.println("The largest element of an array is " + result);
    }
}
