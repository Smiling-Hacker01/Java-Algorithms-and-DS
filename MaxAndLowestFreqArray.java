//code is to find the maximum and lowest freq among the given array elements using an hash map
import java.util.Collections;
import java.util.HashMap;
public class MaxAndLowestFreqArray {
    public static void findMaxAndMinFreq(int[]nums){
        if(nums.length == 0){
             System.out.println("Array is empty"); 
             return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxfreq = Collections.max(map.values());
        int lowestFreq = Collections.min(map.values());
        System.out.println("Maximum freq among array elements is => " + maxfreq);
        System.out.println("Lowest freq ammong array elements is => " + lowestFreq);
    }

    //main function
    public static void main(String[] args) {
        int[]nums = {1,1,1,2,3,4,2,2,3};
        findMaxAndMinFreq(nums);
    }
}
