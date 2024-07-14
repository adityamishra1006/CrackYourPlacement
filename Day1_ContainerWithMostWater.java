class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int n = height.length;
        
        int i = 0; 
        int j = n-1;

        while(i<j){
            int currentHeight = Math.min(height[i], height[j]);
            int currentWidth = j-i;
            int currentArea = currentHeight*currentWidth;

            maxArea = Math.max(maxArea, currentArea);

            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
