class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)
        {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        if(leftMax > rightMax)
        {
            return leftMax+1;
        }
        else
        {
            return rightMax+1;
        }
    }
}
