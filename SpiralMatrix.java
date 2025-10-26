//code is to print the spiral matrix of the given m * n matrix

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][]matrix){
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> spiral = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // Move left to right
            for(int i = left; i <= right; i++){
                 spiral.add(matrix[top][i]);
            }
            top++; // to be in a second row
            
            // Move right to bottom
            for(int j = top; j <= bottom; j++){
                spiral.add(matrix[j][right]);
            }
            right--; // to be in a next column from the last

            // Move right to left only if there is two rows ( to skip duplicate follow ups)
            if(top <= bottom){
                for(int k = right; k >= left; k--){
                    spiral.add(matrix[bottom][k]);
                }
                bottom--; //  to skip the same bottom element and to be in a one top position
            }
            
            // Move from bottom to top only if there is a top position available i.e  if left > right ( no top element)
            if (left <= right) {
                for(int l = bottom; l >= top; l--){
                    spiral.add(matrix[l][left]);
                }
                left++;
            }
        }
        return spiral;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println( "Spiral order of Matrix => " + result);
    }
}
