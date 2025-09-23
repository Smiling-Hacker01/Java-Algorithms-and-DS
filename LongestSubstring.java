//code is to find the length of the longest substring without repeating characters
import java.util.HashSet;

public class LongestSubstring {
    public static int unRepeatingLongestSubstring(String s){
       if (s.length() < 0) {
        return -1;
       }
       HashSet<Character> charSet = new HashSet<>();
       int length = s.length();
       int left = 0;
       int maxLenght = 0;
       for(int right = 0; right < length; right++ ){
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
         maxLenght = Math.max(maxLenght, right - left + 1);
       }
       return maxLenght;
    }
    //main function
    public static void main(String[] args){
        String s = "abccabcab";
        int substringLength = unRepeatingLongestSubstring(s);
        System.out.println("length of the longest substring without repeating char is " + substringLength);
    }
}
