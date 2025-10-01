public class ArmstrongNumber {
    public static boolean isArmStrong(int n){
        if (n <= 0) {
            return true;
        }
        int copyN = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += (digit*digit*digit);
            n = n / 10;
        }
        if (sum != copyN) {
            return false;
        }
        return true;
    }
    //main function 
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Is number " + n + " is a Armstrong number ? " + isArmStrong(n));
    }
}
