//code is to find the kth distinct strings in an array

import java.util.HashMap;

public class KthDistinctString {
    public static String getDistinct(String[]arr, int k){
        if (arr.length < k) {
            return "";
        }
    HashMap<String, Integer> map = new HashMap<>();
    for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    for (String s : arr) {
        if (map.get(s) == 1) {
            k--;
            if (k == 0) {
                return s;
            }
        }
    }
        return "";
    }
    //main function
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "a", "d", "c"};
        int k = 2;
        String result = getDistinct(arr, k);
        System.out.println("The " + k + " distinct elements from the string is " + result);
    }
}
