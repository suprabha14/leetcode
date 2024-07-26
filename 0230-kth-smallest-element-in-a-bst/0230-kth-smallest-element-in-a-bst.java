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
    int mini = Integer.MIN_VALUE;
    int c = 0;
    public void small(TreeNode root, int k) {
        if(root == null)
        return;
        small(root.left, k);
        c++;
        if(c == k) {
            mini = root.val;
            return;
        }
        small(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        small(root, k);
        return mini;
    }
}