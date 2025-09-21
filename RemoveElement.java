//code is to remove element from an array and return the size of the new array
public class RemoveElement{
    public int remove(int[]nums, int val){
         if (nums.length <= 0 || val < 0) {
            return 0;
         }
         int j = 0;
         for(int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
         }
         return j;
    }
    //function to print an array
    public static void printArray(int[]array, int size){
        if (size <= 0) {
            System.out.println("No elements to print");
            return;
        }
        for(int i = 0; i < size; i++){
              System.out.print(array[i] + " ");
        }
        return;
    }
    //main function
    public static void main(String[] args){
        RemoveElement sollution = new RemoveElement();
        int[]nums = {1,2,3,4,5,6};
        int val = 3;
       int result =  sollution.remove(nums, val);
       printArray(nums, result);
    }
}