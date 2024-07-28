class Solution {
    static boolean ans;
    int levels(TreeNode root){
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        int diff = Math.abs(leftLevel-rightLevel);
        if(diff>1) ans = false;
        return 1+Math.max(leftLevel, rightLevel);
    }
    public boolean isBalanced(TreeNode root) {
        ans = true;
        levels(root); //TC : O(n)
        return ans;
    }
}
