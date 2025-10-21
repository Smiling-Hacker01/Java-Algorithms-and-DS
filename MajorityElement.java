//code is to find the majority element Its the element that appears more than ⌊n / 2⌋ times in an array.

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

             if(map.get(nums[i]) > nums.length/2) maxCount = nums[i];
        }
        return maxCount;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println("The majority element in an array is " + result);
    }
}
