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
    private int count=0;
    int k;
    HashMap<Long, Integer> map = new HashMap();
    private void preorder(TreeNode root, long sum){
        if(root==null) 
            return;

        // current sum
        sum+=root.val;

        if(sum==k)
            count++;

        // number of times the curr_sum − k has occured already, 
        // determines the number of times a path with sum k 
        // has occured upto the current node
        count+=map.getOrDefault(sum-k,0);

        // add the current sum into hashmap
        // to use it during the child nodes processing
        map.put(sum, map.getOrDefault(sum,0)+1);

         // process left subtree
        preorder(root.left, sum);
        // process right subtree
        preorder(root.right, sum);

        // remove the current sum from the hashmap
        // in order not to use it during 
        // the parallel subtree processing
        map.put(sum, map.get(sum) - 1);   
    }
    public int pathSum(TreeNode root, int targetSum) {
        k=targetSum;
        preorder(root, 0L);
        return count;
    }
}