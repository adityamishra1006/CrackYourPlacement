class Solution {
    Integer prev;
    int diff;

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null){
            diff = Math.min(diff, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        prev = null;
        diff = Integer.MAX_VALUE;;
        inorder(root);
        return diff;
    }
}
