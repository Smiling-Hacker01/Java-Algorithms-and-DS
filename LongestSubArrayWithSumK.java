//code is to find the longest sub array which has some equals to k
import  java.util.HashMap;
public class LongestSubArrayWithSumK {
    public static int longestSubArray(int[] arr, int k){
        if(arr == null || arr.length < 0) return  0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentPrefixSum = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            currentPrefixSum += arr[i];
            
            int requiredOldSum = currentPrefixSum - k;
            if (map.containsKey(requiredOldSum)) {
                int length = i - map.get(requiredOldSum);
                maxLength = Math.max(length, maxLength);
            }
            if (!map.containsKey(currentPrefixSum)) {
                map.put(currentPrefixSum, i);
            }
        }
        return maxLength;
    }
    //main function
    public static void main(String[] args) {
        int[]arr = {10,5,2,7,1,-10};
        int k = 15;
        int result = longestSubArray(arr, k);
        System.out.println("The longest subArray that has some equals to " + k + " is length of " + result);
    }
}
