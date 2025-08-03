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
        Stack<TreeNode> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode r=st.pop();
            al.add(r.val);
            if(r.right!=null) st.push(r.right);
            if(r.left!=null) st.push(r.left);
        }

        return al;

        
    }
}