public class ReverseInteger {
     public int reverse(int x) {
        int rev = 0;
        int num = 0;
        while(x != 0){
           num = x % 10;
           x = x / 10;
       if(rev > Integer.MAX_VALUE/10 || ( rev == Integer.MAX_VALUE/10 && num > 7 )){
             return 0;
       }
       if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && num < -8)){
             return 0;
        }
           rev = rev * 10 + num;
       }
        return rev;
    }
    //main function
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int x = 123;
        int result = ri.reverse(x);
        System.out.println("Reversed Integer: " + result);
    }
}
