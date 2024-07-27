class Solution {
    static boolean flag;
    public long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftMax = max(root.left);
        if(leftMax>=root.val) flag = false;
        long rightMax =  max(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftMin = min(root.left);
        long rightMin =  min(root.right);
        if(rightMin<=root.val) flag = false;
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }

    public boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        min(root);
        return flag; 
    }
}
