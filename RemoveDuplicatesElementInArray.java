//code is to remove duplicates in a array without sorting and return the modified array as a ArrayList
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesElementInArray {
    public static ArrayList<Integer> removeDuplicates(int[]nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return new ArrayList<>(set);
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {2,2,3,3,6,5};
        ArrayList<Integer> result = removeDuplicates(nums);
        System.out.println(result);
    }
}
