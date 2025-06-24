/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null)
        {
            if(root.val<=root.left.val)
                return false;
            TreeNode t=findLeftLargest(root.left);
            if(t.val>=root.val)return false;
        }
        if(root.right!=null)
        {
            if(root.val>=root.right.val)
                return false;
            TreeNode t=findRightSmallest(root.right);
            if(t.val<=root.val)return false;
        }
        return isValidBST(root.left) && isValidBST(root.right); 
        
    }
    public TreeNode findRightSmallest(TreeNode root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public TreeNode findLeftLargest(TreeNode root)
    {
        while(root.right!=null)
        {
            root=root.right;
        }
        return root;
    }
}