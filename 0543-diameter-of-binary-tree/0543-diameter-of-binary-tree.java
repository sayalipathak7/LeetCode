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
        int[] max=new int[1];
        diameterOfBinaryTree(root,max);
        return max[0];
  
    }
    public int diameterOfBinaryTree(TreeNode root, int[] max)
    {
        if(root==null)return 0;
        int max_left=diameterOfBinaryTree(root.left,max);
        int max_right=diameterOfBinaryTree(root.right,max);
        int dia=max_left+max_right;
        max[0]=Math.max(dia,max[0]);
        return Math.max(max_left,max_right)+1;

    }

}