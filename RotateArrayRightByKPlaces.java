//code is to rotate array right by k places (basic Approach) 
public class RotateArrayRightByKPlaces {
    public static void rotateArray(int[]nums, int k){
        int n = nums.length;
        k = k % n;
        int[]temp = new int[k];

        //copying elements that are going to be shifted in temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n-k+i];
        } 
        //now after making space we will shift remaning elements to the right
        for (int i = n-k-1; i >= 0; i--) {
            nums[i+k] = nums[i];
        }
        //putting back the copied elements in an array
        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(nums, k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
