//code is to check if the array is sorted
public class IsSortedArray {
    public static boolean isSorted(int[]nums){
        for(int i = 0; i < nums.length; i++){
             if (i > 0 && nums[i] < nums[i-1]) return false;
        }
       return true;
    }

    //main function
    public static void main(String[] args) {
        int[]nums = {1,1,1,4,5};
        boolean result = isSorted(nums);
        System.out.println("Is the array sorted? " + result);

    }
}
