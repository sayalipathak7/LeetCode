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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        kthSmallest(root,k,res);
        return res.get(k-1);
       

        

    }
    public void kthSmallest(TreeNode root, int k, ArrayList<Integer> res)
    {
        if(root==null) return ;
        kthSmallest(root.left,k,res);
        res.add(root.val);
        kthSmallest(root.right,k,res);

    }
}