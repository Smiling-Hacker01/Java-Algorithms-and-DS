//code is to search in rotated sorteed array and we have to solve the problem using binary search
public class SearchInRotatedSortedArray {
    public static int search(int[]nums, int target){
       int left = 0;
       int right = nums.length-1;
       while (left <= right) {
          int mid = (left + right) / 2;
          if(nums[mid] == target) return  mid;
          
          //check if left side of the array is sorted or not
          if (nums[left] <= nums[mid]) {
              if (target >= nums[left] && target < nums[mid]) {
                  right = mid-1;
                }else{
                  left = mid + 1;
              }
          }
          else{
            if (target > nums[mid] && target <= nums[right]) {
                left = mid+1;
            }else{
                right = mid -1;
            }
          }
       }
        return -1;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {5,1,3};
        int target = 3;
        int result = search(nums, target);
        System.out.println("At which index does the target present in an array :- " + result);
    }
}
