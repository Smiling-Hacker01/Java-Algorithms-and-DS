//code is to calculate the x^n in binary form to reduce the time complexity to logn
public class XToPowNinBinaryForm {
    public static double myPow(double x, int n){
        if(x == 0) return 0.0;
        if(n == 0) return 1.0;
        if(x == 1) return 1.0; // common edge cases to improve the productivity
        long binaryForm = n;
        //edge case to handle the negative powers
        if (binaryForm < 0) {
            x = 1/x;
            binaryForm = -binaryForm ;// unary negation change operator
        }
        double result = 1;
        while (binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                result = result * x;
            }
            x = x*x;
            binaryForm = binaryForm/2;
        }
        return result;
    }
    //main function 
    public static void main(String[] args){
        double x = 3.0;
        int n = 5;
        double result = myPow(x, n);
        System.out.println("The power of " + x + " to the " + n + " is => " + result);
    }
}
