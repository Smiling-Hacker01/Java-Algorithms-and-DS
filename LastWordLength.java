public class LastWordLength {
        public static  int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    //main function
    public static void main(String[] args) {
        String s = "Vishal Singh Kushwaha";
       int result = lengthOfLastWord(s);
       System.out.println("The length of the last word of the string is => "+ result);
    }
}
