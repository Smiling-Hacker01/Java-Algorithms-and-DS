import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int left;
        int right;
        int sum;
        for(int i = 0 ; i < nums.length -2; i++){
             if(i > 0 && (nums[i] == nums[i-1]))continue;
             left = i+1;
             right = nums.length-1;
             while(left < right){
                 sum = nums[i] + nums[left] + nums[right];
                 if(Math.abs(sum - target) < Math.abs(closest - target)){
                     closest = sum;
                 }
                 else if(sum < target){
                    left++;
                 }
                 else if(sum > target){
                    right--;
                 }
                 else{
                    return sum;
                 }
             }
        }
        return closest;
    }
    //main function
    public static void main(String[] args) {
        ThreeSumClosest tsc = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = tsc.threeSumClosest(nums, target);
        System.out.println("Closest sum: " + result);
    }
}
