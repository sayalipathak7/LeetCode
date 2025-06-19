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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int max[]=new int[1];
        ht(root,max);
        return max[0];
        
    }
    public int ht(TreeNode root,int max[])
    {
        if(root==null)return 0;
        int l=ht(root.left,max);
        int r=ht(root.right,max);
        int dia=l+r;
        max[0]=Math.max(dia,max[0]);
        return Math.max(l,r)+1;
    }
}