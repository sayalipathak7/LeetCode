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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> l=new LinkedList<>();
        LinkedList<TreeNode> stack=new LinkedList<>();
        if(root==null)
        {
            return l;
        }
        
        stack.add(root);
        while(!stack.isEmpty())
        {
            TreeNode t=stack.pollLast();
            l.add(t.val);
            if(t.right!=null)
            {
                stack.add(t.right);
            }
            if(t.left!=null)
            {
                stack.add(t.left);
            }
            
        }
        return l;
        
    }
}