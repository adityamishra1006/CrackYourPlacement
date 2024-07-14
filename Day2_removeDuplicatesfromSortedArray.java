class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        for(int i = 0; i<n; i++){
            if(nums[i] != nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
