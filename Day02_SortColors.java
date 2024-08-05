class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int noOfZeroes = 0;
        int noOfOnes = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 0) noOfZeroes++;
            if(nums[i] == 1) noOfOnes++;
        }

        for(int i = 0; i<n; i++){
            if( i < noOfZeroes){
                nums[i] = 0;
            }
            else if( i < noOfZeroes + noOfOnes){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}
