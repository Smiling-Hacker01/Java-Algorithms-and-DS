//code is to return the new array after we increase the total nums value considering as one integer by 1.
public class PlusOne {
    public static int[] plusOneInt(int[]digits){
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
    //main function
    public static void main(String[] args) {
        int[]digits = {1,2,3};
        int[]result = plusOneInt(digits);
        System.out.println("The new number after plus one addision is :" );
        for (int i : result) {
            System.out.print(i);
        }
    }
}
