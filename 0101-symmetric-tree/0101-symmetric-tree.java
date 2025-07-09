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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;

       return isSymmetric(root.left,root.right);
        
    }
    public boolean isSymmetric(TreeNode lSubTree,TreeNode rSubTree)
    {
        if(lSubTree==null && rSubTree==null)return true;
        if(lSubTree==null || rSubTree==null)return false;
        if(lSubTree.val!=rSubTree.val)return false;

        return isSymmetric(lSubTree.left,rSubTree.right) && isSymmetric(lSubTree.right,rSubTree.left);
    }
}