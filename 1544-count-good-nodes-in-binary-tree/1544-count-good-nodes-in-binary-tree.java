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
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        return goodNodes(root,root.val);
        
    }
    public int  goodNodes(TreeNode root,int maxsofar)
    {
        if(root==null )return 0;
        int cnt=root.val>=maxsofar?1:0;
        maxsofar=Math.max(root.val,maxsofar);
        cnt=cnt+goodNodes(root.left,maxsofar);
        cnt=cnt+goodNodes(root.right,maxsofar);
        return cnt;
        
    }
   
}