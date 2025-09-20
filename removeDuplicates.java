public class removeDuplicates {
    public int removeDuplicatesArray(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int j = 1;
        for(int i = 1; i < array.length; i++){
            if (array[i] != array[i-1]) {
                array[j] = array[i];
                j++;
            }
        }
        return j;
    }
    //main function
    public static void main(String[] args){
        int[] array = {1,2,2,2,4,5,6};
        removeDuplicates removeD = new removeDuplicates();
       int result =  removeD.removeDuplicatesArray(array);
       for(int i = 0; i < result; i++){
           System.out.print(array[i] + " ");
       }
        
    }
}
