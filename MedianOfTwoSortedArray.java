//code is to find the median of two sorted array easy version

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[]nums1, int[] nums2){
         int m = nums1.length;
         int n = nums2.length;
         int size = m+n;
         double median = 0.0;
         int[] merged = new int[size];
         for(int i = 0; i < m; i++){
             merged[i] = nums1[i];
         }
         for(int j = 0; j < n; j++){
            merged[m+j] = nums2[j];
         }
         Arrays.sort(merged);
         int length = merged.length;
         //even case
         if (length % 2 == 0) {
             median = (merged[length/2] + merged[(length/2) - 1]) / 2.0;
         }
         //odd case
         if(length % 2 != 0){
            median = merged[length/2];
         }
         return  median;
    }
    //main function
    public static void main(String[] args) {
        int[]nums1 = {1, 2, 3};
        int[] nums2 = {2,4,5};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median of two sorted array is " + result);

    }
}
