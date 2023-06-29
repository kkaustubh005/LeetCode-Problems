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
    private void preorder(TreeNode root, List<Integer> list){ //Top-down approach (preorder)
        if(root==null) return;
        if(root.left==null && root.right==null) //check leaf node
            list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preorder(root1, list1);
        preorder(root2, list2);
        
        return list1.equals(list2);
    }
}