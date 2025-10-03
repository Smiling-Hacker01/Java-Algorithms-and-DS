//we have given a problem in which we have two basket and we can only put two specific fruit at a time.. On other words the proble is we have to find the longes subarray woth maximum two different characters 

import java.util.HashMap;

public class MaxFruitsInABasket {
    public static int totalFruits(int[]fruits){
        int maxFruits = 0;
        int left = 0;
        int right = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < n) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            if (map.size() > 2) {
                map.replace(fruits[left], map.get(fruits[left]) - 1);
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
    public static void main(String[] args) {
        int[]fruits = {0,1,2,2};
        int result = totalFruits(fruits);
        System.out.println("The maximum fruits we can put in our basket is => " + result);
    }
}
