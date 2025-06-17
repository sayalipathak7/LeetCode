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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null)return res;
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode n=st.pop();
            res.add(n.val);
            if(n.left!=null) st.push(n.left);
            if(n.right!=null) st.push(n.right);
        }

        Collections.reverse(res);
        return res;
        
    }
    
}