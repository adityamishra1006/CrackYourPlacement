class Tree
{
    
    public static void inorder(Node root, ArrayList<Integer> inorder){
        if(root == null) return;
        inorder(root.left, inorder);
        inorder.add(root.data);
        inorder(root.right, inorder);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        
        
        int count = inorder.size();
        
        if (count % 2 == 1) {
            return inorder.get(count / 2);
        } else {
            return (inorder.get((count - 1) / 2) + inorder.get(count / 2)) / 2.0f;
        }
    }
}
