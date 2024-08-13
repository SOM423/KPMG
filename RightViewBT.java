class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        rightView(root,list,0);
        return list;
        
    }

    public static void rightView(TreeNode root,List<Integer> list,int CurrDepth)
    {
        if(root == null)
        {
            
            return;
        }
           
        if(CurrDepth == list.size())
        {
             list.add(root.val);
        }

            rightView(root.right,list,CurrDepth+1);
            rightView(root.left,list,CurrDepth+1);
    }
}
