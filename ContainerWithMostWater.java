public class ContainerWithMostWater {  
    public static int maxArea(int[]height){
        int maxContainer = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int sh = Math.min(height[left], height[right]);
            int width = right - left;
            int area = sh * width;
            maxContainer = Math.max(maxContainer, area);
            if (height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxContainer;
    }
    //main function
    public static void main(String[] args){
        int[] height = {1,3,4,6,7,8};
        int maxWaterContainer = maxArea(height);
        System.out.println("Container with most water is -> " + maxWaterContainer);
    }
}