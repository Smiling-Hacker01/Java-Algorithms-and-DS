//code is to merge two sorted array in O(m + n) time complexity
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int p1 = m - 1; 
        int p2 = n - 1; 
        int write_ptr = m + n - 1; 
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
                nums1[write_ptr] = nums1[p1];
                p1--;
            } else {
                nums1[write_ptr] = nums2[p2];
                p2--;
            }
            write_ptr--;
        }
    }
    //main function
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
