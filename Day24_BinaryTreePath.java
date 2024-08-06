class Solution {
    public void helper(TreeNode root, String s, List<String> ans){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left, s+root.val + "->", ans);
        helper(root.right, s+=root.val + "->", ans);
     }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, "", list);
        return list;
    }
}
