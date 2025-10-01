public class CalculateGCd {
    public static int calculateGCDIteratively(int a, int b){
        if ( a == 0) {
            return b;
        }
        else if (b == 0) {
            return a;
        }
        else if (a == b) {
            return a;
        }
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if (a == 0) return b;
        return a;
    }
    //recursive way to calculate gcd 
    public static int calculateGCDRecursively(int a, int b){
        if (b == 0) {
            return a;
        }
        return calculateGCDRecursively(b, a%b);
    }
    //calculate LCM of a number 
    public static int calcLCM(int a, int b){
        int gcd = calculateGCDRecursively(a, b);
        return (a *b) / gcd;
    }

   //main function
   public static void main(String[] args){
      int a = 20;
      int b = 28;
      int result = calculateGCDIteratively(a, b);
      int result2 = calculateGCDRecursively(a, b);
      System.out.println("GCD with iterative way " + result + " Gcd With Recursive way  " + result2);
      int result3 = calcLCM(a, b);
      System.out.println("LCM of " + a + " or " +  b + " is " +  result3);
   }
}
