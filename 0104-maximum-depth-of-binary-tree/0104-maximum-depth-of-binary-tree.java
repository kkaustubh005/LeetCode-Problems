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
    /*public int maxDepth(TreeNode root) { //Bottom-up approach (Postorder)
        if(root==null){
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }*/
    //Top-down approach (Preorder)
    private int ans;
    private void maxDepth(TreeNode root, int depth){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            ans = Math.max(ans,depth);
        maxDepth(root.left, depth+1);
        maxDepth(root.right, depth+1);
    }
    public int maxDepth(TreeNode root) {
        maxDepth(root, 1);
        return ans;
    }
}