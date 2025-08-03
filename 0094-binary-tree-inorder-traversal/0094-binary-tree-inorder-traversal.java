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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        while(!st.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            TreeNode r=st.pop();
            al.add(r.val);
            if(r.right!=null) root=r.right;
            

        }

        return al;
        
    }
}