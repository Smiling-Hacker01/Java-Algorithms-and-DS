//find the missing and repeated values in a grid if the grid contains the value from 1 to n^2

import java.util.HashSet;
import java.util.Set;

public class MissingAndRepeatedValues { 
    public static int[] findMissingAndRepeatedValues(int[][] grid){
        int n = grid.length;
        int size = n*n;
        Set<Integer> set = new HashSet<>();
        int repeated = -1, missing = -1;
        for (int[] row : grid) {
            for(int num : row){
                if (set.contains(num)) {
                    repeated =  num;
                }
                set.add(num);
            }
        }
        
        for(int num = 1; num <= size; num++){
            if (!set.contains(num)) {
                missing = num;
                break;
            }
        }
        return  new int[]{repeated, missing};

    }

    //main function
    public static void main(String[] args) {
        int[][] grid = {{9,1,7}, {8,9,2}, {3,4,6}};
        int[] result = findMissingAndRepeatedValues(grid);
         for (int num : result) {
             System.out.print(num + " ");
         }
    }
    
}
