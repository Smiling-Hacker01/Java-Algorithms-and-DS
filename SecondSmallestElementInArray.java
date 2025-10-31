//code is to find the second smallest element in an array
public class SecondSmallestElementInArray {

    public static int secondSmallest(int[]nums){
           int secondSmallest = Integer.MAX_VALUE;
           int smallest = nums[0];
           for(int i = 1; i < nums.length; i++){
                if (nums[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = nums[i];
                }
                else if (nums[i] < secondSmallest && nums[i] != smallest) {
                    secondSmallest = nums[i];
                }
           }
           return secondSmallest == Integer.MAX_VALUE? -1 : secondSmallest;
    }

    //main function
    public static void main(String[] args) {
        int[]nums = {12,35,1,10,34,34};
        int result = secondSmallest(nums);
        if (result == -1) {
            System.out.println("No second smallest element present in the array ");
        }else{
            System.out.println("The second smallest element of an array is " + result);
        }
    }
}
