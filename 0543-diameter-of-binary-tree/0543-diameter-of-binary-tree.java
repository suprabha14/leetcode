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
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return maxi;
    }
    int maxi = 0;
    public int diameter(TreeNode root) {        
        if(root == null)
        return 0;
        int lt = diameter(root.left);
        int rt = diameter(root.right);
        int curr = lt + rt;
        maxi = Math.max(maxi, curr);
        return Math.max(lt, rt) + 1;
    }
}