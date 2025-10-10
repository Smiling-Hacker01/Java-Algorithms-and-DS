//code is to check wether the each pair of the array is diffrerent that means is even or odd
public class SpecialArray1 {
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static boolean isSpecialArray(int[] nums){
        if(nums.length < 1) return  false;
        for(int i = 1; i < nums.length; i++){
            if (isEven(nums[i]) == isEven(nums[i-1])) {
                return  false;
            }
        }
        return true;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6};
        boolean result = isSpecialArray(nums);
        System.out.println("Is the given array is of special type => " + result);
    }
}
