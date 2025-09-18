public class PalindromeNumber {
    public static int revInteger(int num){
        int rev = 0;
        int digit = 0;
        while(num != 0){
          digit = num % 10;
          num = num / 10;
          if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)){
              return 0;
          }
          if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)){
                 return 0;
          }
          rev = rev * 10 + digit;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(x < 0){
           return false;
        }
        int reverse = revInteger(x);
        if(x == reverse){
            return true;
        }else{
            return false;
        }
    }
    //main function
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int x = 121;
        boolean result = pn.isPalindrome(x);
        System.out.println("Is Palindrome: " + result);
    }
}
