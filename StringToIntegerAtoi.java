public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        int i = 0; int n = s.length();
        //handling white spaces 
        while(i < n && s.charAt(i) == ' ') i++;

        //handling signs
        boolean isNegative = false;
        if(i < n  && (s.charAt(i) == '+' || s.charAt(i) == '-')){
              isNegative = (s.charAt(i) == '-');
              i++;
        }
        //converting to integer;
        int result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
             int digit = s.charAt(i) - '0';
             
             //checking for the overfolw here
             if(result > (Integer.MAX_VALUE - digit)/10){
                 return isNegative? Integer.MIN_VALUE : Integer.MAX_VALUE;
             }
             result = result * 10 + digit;
             i++;
        }
        return isNegative ? -result : result;
    }
    //main function
    public static void main(String[] args) {
        StringToIntegerAtoi atoi = new StringToIntegerAtoi();
        String s = "   -42";
        int result = atoi.myAtoi(s);
        System.out.println("Integer: " + result);
    }
}
