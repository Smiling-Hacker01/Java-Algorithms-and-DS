import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
        public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        int left;
        int right;
        Arrays.sort(nums);
        boolean isPositiveArray = true;
        for(int n : nums){
             if(n < 0) isPositiveArray = false;
        }
        if(isPositiveArray == true && target < 0){
            return list;
        }
        for(int i = 0; i < nums.length-3; i++){
            //skipping duplicates first element in an array
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j = i+1; j < nums.length-2; j++){
                //skipping duplicate j that means the second element
                if(j > i + 1 && nums[j] == nums[j-1])continue;
                left = j+1;
                right = nums.length-1;
                while(left < right){
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        //skipping same third element 
                        while(left < right && (nums[left] == nums[left - 1]))left++;
                        //skipping same fourth element
                        while(left < right && (nums[right] == nums[right + 1]))right--;
                    }
                    else if(sum < target){
                          left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return list;
    }
    //main function
    public static void main(String[] args){
        FourSum four = new FourSum();
       int[] array = {1,0,-1,0,-2,2};
       int target = 0;
       List<List<Integer>> result = new ArrayList<>();
         result = four.fourSum(array, target);
         System.out.println(result);
    }
}
