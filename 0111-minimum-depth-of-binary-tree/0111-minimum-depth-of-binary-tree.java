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
    int min = Integer.MAX_VALUE;
    public void traversal(TreeNode root, int depth) {
        if(root==null) return;
        ++depth;
        if(root.left==null && root.right==null) {
            if(depth<min)
                min=depth;
        }
        traversal(root.left,depth);
        traversal(root.right,depth);
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        traversal(root,0);
        return min;
    }
}