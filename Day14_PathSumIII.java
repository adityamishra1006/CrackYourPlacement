class Solution {
    int helper(TreeNode root, long sum){
        if(root == null) return 0;
        int count = 0;
        if(root.val == sum) count++;
        count += helper(root.left, sum-root.val) + helper(root.right, sum-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return helper(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
}
