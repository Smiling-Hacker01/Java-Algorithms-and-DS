//code is to remove the anagrams from the string array and return the array which does not have any anagrams strings
import java.util.ArrayList;
public class RemoveAnagramsFromArray {
        public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
         int hash[] = new int[26];
         for(int i = 0; i < s1.length(); i++){
             hash[s1.charAt(i) - 'a']++;
             hash[s2.charAt(i) - 'a']--;
         }
         for (int i : hash) {
            if(i != 0) return  false;
         }
         return true;
    }
    // function to remove anagrams from the array list
    public static ArrayList<String> removeAnagrams(String[] words){
          ArrayList<String> list = new ArrayList<>();
          list.add(words[0]);
          for(int i = 1; i < words.length; i++){
               if(!isAnagram(words[i], words[i-1])){
                    list.add(words[i]);
               }
          }
          return  list;
    }
    //main function
    public static void main(String[] args){
        String[] words = {"abba","baba","bbaa","cd","cd"};
        ArrayList<String> list = removeAnagrams(words);
         for (String string : list) {
              System.out.println(string);
         }
    }
}
