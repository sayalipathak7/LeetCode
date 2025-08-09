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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        // if(Math.abs(ht(root.left)-ht(root.right))>1)return false;

        // return isBalanced(root.left) && isBalanced(root.right);
        int val=ht(root);
        if(val==-1)return false;
        else return true;
        
    }
    // public int ht(TreeNode root)
    // {
    //     if(root==null)return 0;
    //     return Math.max(ht(root.left),ht(root.right))+1;

    // }

    //  public boolean isBalanced(TreeNode root) {
    //     if(root==null)return true;
    //     if(Math.abs(ht(root.left)-ht(root.right))>1)return false;

    //     return isBalanced(root.left) && isBalanced(root.right);
        
    // }
    public int ht(TreeNode root)
    {
        if(root==null)return 0;
        int left=ht(root.left);
        if(left==-1)return -1;
         int right=ht(root.right);
        if(right==-1)return -1;
        if(Math.abs(left-right)>1)return -1;
        return Math.max(ht(root.left),ht(root.right))+1;

    }
}