//code is to reverse first k character of the string in a 2 * k block and leaving the other character as unchanged
public class ReverseStringTwo{
    public static String reverse(String s, int k){
         char[] arr = s.toCharArray();
         int n = arr.length;
         for(int i = 0; i < n; i += 2 * k){
            int left = i;
            int right = Math.min(i + k - 1, n-1);
            while (left < right) { 
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
         }
         return new String(arr);
    }
    //main function
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String reverseK = reverse(s, k );
        System.out.println("Reverse string " + reverseK);
    }
}