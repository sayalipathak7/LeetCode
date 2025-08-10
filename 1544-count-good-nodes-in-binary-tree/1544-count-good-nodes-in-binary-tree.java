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
        int [] a=new int[1];
        a[0]=0;
        goodNodes(root,a,Integer.MIN_VALUE);
        return a[0];

        
    }
    public void goodNodes(TreeNode root,int[] a,int max)
    {
        if(root==null)return;
        max=Math.max(root.val,max);
        if(root.val>=max) a[0]=a[0]+1;
        goodNodes(root.left,a,max);
        goodNodes(root.right,a,max);



    }
}