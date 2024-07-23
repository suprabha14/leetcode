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
    public boolean check(TreeNode lNode, TreeNode rNode) {
        if(lNode == null && rNode == null)
        return true;
        if(lNode == null || rNode == null)
        return false;
        return lNode.val == rNode.val && check(lNode.left, rNode.right) && check(lNode.right, rNode.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        return true;
        return check(root.left, root.right); 
    }
}