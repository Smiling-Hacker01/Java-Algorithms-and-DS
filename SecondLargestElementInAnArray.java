//code is to find the second largest element in an array
public class SecondLargestElementInAnArray {
    public static int secondLargest(int[]nums){
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > largest){
               secondLargest = largest;
               largest = nums[i];
            }
            else if (nums[i] > secondLargest && nums[i] < largest ) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {12,35,1,10,34,34};
        int result = secondLargest(nums);
        if (result == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in an array");
        }
        else{
        System.out.println("The second largest element of an array is " + result);
        }
    }
}
