class ReverseInteger{
     public int reverseInt(int x){
        int rev = 0;
        int num = 0;
        while(x != 0){
            num = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && rev > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && rev < -8)){
                return 0;
            }
            rev = rev * 10 + num;            
        }
        return rev;
     }
     //main function
     public static void main(String[] args){
          int x = 2345;
          ReverseInteger reverse = new ReverseInteger();
          int result = reverse.reverseInt(x);
          System.out.println("The reversed Integer is " + result);
     }
}