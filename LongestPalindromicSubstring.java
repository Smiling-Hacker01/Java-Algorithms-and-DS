//code is to find the longest palindromic substring in a string without the too much explanation

public class LongestPalindromicSubstring {
    //helper function to exapnd our stirng from middle
    public static int expandFromTheCentre(String str, int left, int right){
         while (left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
         }
         return right-left-1;
    }
    //function to find the longest substring and return it to the user
    public static String findLongestPalindromicSubstring(String s){
           int start = 0;
           int end = 0;
         for(int i = 0; i < s.length(); i++){
           //calculate the lenght for the odd lenght substring;
           int len1 = expandFromTheCentre(s, i, i);
           int len2 = expandFromTheCentre(s, i, i+1);
           int maxLenght = Math.max(len1, len2);
           //update the longest find substring
           if(maxLenght > end - start){
            //update the start for the longest palindromic substring
            start = i - (maxLenght -1) / 2;
            //update the end
            end = i + maxLenght / 2;
           }
        }
        return s.substring(start, end+1);
    }
    //main function
    public static void main(String[] args){
        String str = "abcabcbbab";
        String lps = findLongestPalindromicSubstring(str);
        System.out.println(lps);
    }
}

