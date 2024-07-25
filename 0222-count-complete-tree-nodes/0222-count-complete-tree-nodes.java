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
    public int countNodes(TreeNode root) {
        if(root == null)
        return 0;
        int lt = 0, rt = 0;
        TreeNode tmp = root;
        while(tmp.left != null) {
            tmp = tmp.left;
            lt++;
        }
        tmp = root;
        while(tmp.right != null) {
            tmp = tmp.right;
            rt++;
        }
        if(lt == rt)
        return 2 * ((int)Math.pow(2, lt) - 1) + 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}