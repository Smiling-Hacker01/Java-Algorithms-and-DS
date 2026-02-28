//code is to count the max Consecutive ones in a array solved using simple for loop
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[]nums){
        int currentCount = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++){
              if (nums[i] != 0) {
                  currentCount++;
                  maxCount = Math.max(maxCount, currentCount);
              }else{
                currentCount = 0;
              }
        }
        return maxCount;
    }
    //main function
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutive ones in a array is => " + result);
    }
}
