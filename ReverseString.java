//code is to reverse a string without using an extra space the sollution must take O(1) space.
public class ReverseString {
    public static void reverseCharArray(char[]s){
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    //main function
    public static void main(String[] args) {
        char[]s = {'H', 'E', 'L', 'L','O'};
        reverseCharArray(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
