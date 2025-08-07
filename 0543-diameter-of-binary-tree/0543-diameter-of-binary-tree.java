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
        int [] m=new int[1];
        maxHt(root,m);
        return m[0];

        
    }
    public int maxHt(TreeNode root,int [] m)
    {
        if(root==null) return 0;

        int left=maxHt(root.left,m);
        int right=maxHt(root.right,m);
        int sum=left+right;
        m[0]=Math.max(sum,m[0]);
        return Math.max(left,right)+1;

    }
}