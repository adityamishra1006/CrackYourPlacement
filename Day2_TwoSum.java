class Solution {
    public int[] twoSum(int[] nums, int k) {
        int[] ans = new int[2];

        for(int i = 0; i<nums.length; i++){
            for(int j = i+ 1; j<nums.length; j++){
                if(nums[i] + nums[j] == k){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
