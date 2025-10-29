//code is to find the peak element from an array in which the left and right element of the current element is strictly lower than it we have to return the indedx of it. 
public class PeakElement {
    public static int findPeak(int[]nums){
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = (left + right)/2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        int result = findPeak(nums);
        System.out.println("The peak element in an array is " + result);
    }
}
