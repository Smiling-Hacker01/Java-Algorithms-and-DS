//code is to check if all the ones are k places away from each other
public class KPlacesAway {
    public static boolean isValid(int[]nums, int k){
        boolean isFirst = true;
        int prevIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (isFirst && nums[i] == 1) {
                isFirst = false;
                prevIndex = i;
                continue;
            }
            if (nums[i] == 1) {
                if (i - prevIndex - 1 >= k) {
                    prevIndex = i;
                }
                else{
                    return false;
                }
            }
        }
      return true;
    }
    //main fucntion
    public static void main(String[] args) {
        int[]binary = {1,0,0,1,0,0,1};
        int k = 2;
        boolean result = isValid(binary, k);
        System.out.println("IS all the one's are " + k + " places away ? " + result);
    }
}
