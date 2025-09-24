//code is to find the correct index in the array to insert the target value or to return the index if the target value is found
public class FindCorrectInsertPosition {
    public static int findIndex(int[]nums, int target){
        if (nums.length < 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target){
                 high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
    //main function
    public static void main(String[] args){
        int[]nums = {1,2,3,4,5};
        int target = 6;
        int insertIndex = findIndex(nums, target);
        System.out.println("The correct index to insert the " + target + " in a array  is -> " + insertIndex);
    }
}
