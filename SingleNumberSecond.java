/*Note this is not the optimal approach to solv this problem */

import java.util.HashMap;
import java.util.Map;

public class SingleNumberSecond {
    public static int singleElement(int[]nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    //main function
    public static void main(String[] args) {
        int[]nums = {3,3,3,2,4,4,4};
        int result = singleElement(nums);
        System.out.println("The element that appears only one time in an array is :- " + result);
    }
}
