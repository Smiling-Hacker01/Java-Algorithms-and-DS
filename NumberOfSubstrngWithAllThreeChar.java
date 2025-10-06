//code is to calculate the total number of substring containing all three char (a, b , c)
public class NumberOfSubstrngWithAllThreeChar {
    //method to count the number of total strings containing all three characters 
    public static int countSubstring(String s){
      if (s.length() < 3) return 0;
      int count = 0;
      int[] lastSeen = {-1,-1,-1};
      for(int i = 0; i < s.length(); i++){
        lastSeen[s.charAt(i) - 'a'] = i;
        if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
            int minLastSeen = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            count = count + (1 + minLastSeen);
        }
      }
      return  count;
    }
    //main function
    public static void main(String[] args) {
        String s = "abcabc";
        int result = countSubstring(s);
        System.out.println("Total number of substring containing all three characters are => " + result);
    }
}
