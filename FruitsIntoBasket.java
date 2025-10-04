//code is to find the maximum number of fruits we can collect in our basket if we can only pick two distinct fruits at a time
import java.util.HashMap;
public class FruitsIntoBasket {
    public static int totalFruit(int[] fruits){
        int maxFruits = 0;
        int right = 0;
        int left = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < n) {
        map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
        if (map.size() > 2) {
            map.replace(fruits[left], map.getOrDefault(fruits[left], 0) - 1);
            if (map.get(fruits[left]) == 0) {
                map.remove(fruits[left]);
            }
            left++;
        }
        if (map.size() <= 2) {
            int length = right - left + 1;
            maxFruits = Math.max(maxFruits, length);
        }
        right++;
            
        }
        return maxFruits;
    }
    //main function 
    public static void main(String[] args){
        int[]fruits = {1,2,3,2,2};
        int result = totalFruit(fruits);
        System.out.println("The maximum number of fruits we can pick is => " + result);
    }
}
