//code is to find the single frequency number in an array using an xor operator 
//properties to remember - 0 xor(^) any num = num always
// num xor(^) num = 0 , always
public class SingleNumber {
    public static int findNumber(int[]nums){
         int result = 0;
         for (int num : nums) {
             result = result ^ num;
         }
         return  result;
    }

    //main function
    public static void main(String[] args) {
        int[]nums = {4,1,2,1,2};
        int result = findNumber(nums);
        System.out.println("Number which does not get repeated in a array is " + result);
    }
    
}
