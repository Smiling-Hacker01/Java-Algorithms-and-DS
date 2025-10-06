//code to find the longest substring of common char if we can change the diff char by k chances
public class LongestSubstringWithRepeatingCharacterRepl {
    public static int longestSubstring(String s, int k){
        if(s.length() <= 0) return 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] Hash = new int[26];
        int left = 0;
        int right = 0;
        while(right < s.length()){
          Hash[s.charAt(right) - 'A']++;
          maxFreq = Math.max(maxFreq, Hash[s.charAt(right) - 'A']);
          if ((right - left + 1) - maxFreq > k) {
             Hash[s.charAt(left) - 'A']--;
             left++;
          }
          if((right - left + 1) - maxFreq <= k){
             int length = right - left + 1;
             maxLength = Math.max(length, maxLength);
          }
          right++;
        }
        return  maxLength;
    }
    //main function
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int result = longestSubstring(s, k);
        System.out.println("The longest substring if we can change upto " + k + " characters is " + result);
    }
}
