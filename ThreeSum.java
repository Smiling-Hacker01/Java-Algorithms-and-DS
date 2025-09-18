import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int left;
        int right;
        for(int i = 0; i < nums.length-2; i++){
             if(i > 0 && nums[i] == nums[i -1]) continue;
             left = i+1;
             right = nums.length-1;
             while(left < right){
                 int sum = nums[i] + nums[left] + nums[right];
                 if(sum == 0){
                     list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     left++;
                     right--;
                     while(left < right && (nums[left] == nums[left - 1]))left++;
                     while(left < right && (nums[right] == nums[right + 1]))right--;
                 }
                 else if(sum < 0){
                    left++;
                 }
                 else{
                    right--;
                 }
             }
        }
       return list; 

    }
    //main function
    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = ts.threeSum(nums);
        System.out.println("Triplets: " + result);
    }
}
