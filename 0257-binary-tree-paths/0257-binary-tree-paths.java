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
    List<String> result = new ArrayList<>();
    public void traversal(TreeNode root, String path) {
        if(root==null) return;
        path += Integer.toString(root.val);
        if(root.left==null && root.right==null){
            result.add(path);
            return;
        }
        path += "->";
        traversal(root.left, path);
        traversal(root.right, path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root, "");
        return result;
    }
}