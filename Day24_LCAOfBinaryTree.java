class Solution {

    public boolean isExist(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(root == node) return true;

        return isExist(root.left, node) || isExist(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root) return root;

        boolean pInLST = isExist(root.left, p);
        boolean qInLST = isExist(root.left, q);

        if(pInLST == true && qInLST == true) return lowestCommonAncestor(root.left, p, q);
        if(pInLST == false && qInLST == false) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
