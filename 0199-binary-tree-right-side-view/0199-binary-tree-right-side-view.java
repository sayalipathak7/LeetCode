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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        rv(root,0,res);
        return res;
        
    }
    public void rv(TreeNode root,int lvl, List<Integer> res)
    {
        if(root==null)return;
        if(res.size()==lvl)res.add(root.val);
        rv(root.right,lvl+1,res);
        rv(root.left,lvl+1,res);
    }
}