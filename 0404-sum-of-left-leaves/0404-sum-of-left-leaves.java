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
    int sum=0;
    public void traversal(TreeNode root, Boolean flag) {
        if(root==null) return;
        if(root.left==null & root.right==null && flag==true)
            sum+=root.val;
        traversal(root.left,true);
        traversal(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        traversal(root, false);
        return sum;
        
    }
}