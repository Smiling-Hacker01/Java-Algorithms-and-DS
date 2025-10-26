//code is to find the pivot element such that the left sum till 1 to x is equal to the sum of x to n.
public class PivotElement {
    public static int findPivot(int n){
        int totalSum = (n * (n + 1))/2;
        int pivot = -1;
        int leftSum = 0;
        for(int i = 1; i <= n; i++){
             int rightSum = (totalSum - leftSum) - i;
             if (leftSum == rightSum) {
                pivot =  i;
                break;
             }
             leftSum += i;
        }
        return pivot;
    }
    //main function
    public static void main(String[] args) {
        int n = 8;
        int result = findPivot(n);
        System.out.println("The pivot in the summasion of " + n + " is " + result);
    }
}
