/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left=null;
        TreeNode right=null;

        if(p.val<root.val || q.val<root.val)
        {
             left=lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val || q.val>root.val)
        {
             right=lowestCommonAncestor(root.right,p,q);
        }
        if(left==null && right==null)return null;
        if(left==null && right!=null) return right;
        if(left!=null && right==null)return left;
        return root;
        
    }
}