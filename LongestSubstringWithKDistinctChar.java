//code is to find the longest substring with at most K distinct characters 
import java.util.HashMap;
public class LongestSubstringWithKDistinctChar {
    public static int maxLength(String s, int k){
      int longest = 0;
      int n = s.length();
      int right = 0;
      int left = 0;
     HashMap<Character, Integer> map = new HashMap<>();
      while (right < n) {
         map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
        if (map.size() > k) {
            map.replace(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
              if (map.get(s.charAt(left)) == 0) {
                   map.remove(s.charAt(left));
              }
              left++;
        }
        if (map.size() <= k) {
            int length =  right - left + 1;
            longest = Math.max(length, longest);
        }
        right++;
      }
      return longest;
    }
    //main function
    public static void main(String[] args){
        String str = "aaabbccd";
        int k = 2;
        int result = maxLength(str, k);
        System.out.println("The longest substring with at most 2 distinct characters is => " + result);
    }
}
