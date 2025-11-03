//code is to rotate array one place left without using an extra space
public class RotateArrayOnePlace {
    public static int[] rotateArray(int[] nums){
        int temp = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
        return nums;
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6};
        int[] result = rotateArray(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
