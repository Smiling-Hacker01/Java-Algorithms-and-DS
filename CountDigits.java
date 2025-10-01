//code is to count the number of digits in a given number
public class CountDigits {
    public static int returnCount(int n){
        if (n < 10 && n > 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            // int digit = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }
    //main function
    public static void main(String[] args){
        int n = 3586;
        int result = returnCount(n);
        System.out.println("Total digits in a number " + n + " is " + result);
    }
}
