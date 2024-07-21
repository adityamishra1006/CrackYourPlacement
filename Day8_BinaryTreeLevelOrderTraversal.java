class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) q.add(root);

        while(q.size()>0){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode front = q.remove();
                level.add(front.val);
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            ans.add(level);
        } 
        return ans;
    }
}
