//code is to find the index of the first occurence of a substring in a string
public class indexOfFirstOccurenceString {
    public static int findFirstOccurence(String haystack, String needle){
        if (haystack.length() < 1 || haystack.length() < needle.length()) {
            return -1;
        }
        else if(needle.length() < 1){
             return 0;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j;
            for(j = 0; j < needle.length(); j++){
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    //main function
    public static void main(String[] args){
        String haystack = "vishal";
        String needle = "vish";
        int index = findFirstOccurence(haystack, needle);
        System.out.println("Index of the first occurence of the string (vish) is -> " + index);
    }
}
