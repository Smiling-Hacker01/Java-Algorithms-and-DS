//code is to count the number of primes till n with an optimized way of using sieve of Eratosthenes
import java.util.Arrays;

public class CountPrime {
    public static int returnCount(int n){
        if (n <= 1) {
            return 0;
        }
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true); //initialize all the values till n for true
        int count = 0;

        for(int i = 2; i < n ; i++){

              if (isPrime[i]) {
                count++;

                for(int j = i*2; j < n; j = j+i){
                      //cancel all the multiples of that number and move to next valid one
                     isPrime[j] = false;
                }

              }
        }
        return count;
    }
    //main function
    public static void main(String[] args) {
        int n = 10;
        int result = returnCount(n);
        System.out.println("The total numbers of prime till " + n + " is " + result);
    }

}
