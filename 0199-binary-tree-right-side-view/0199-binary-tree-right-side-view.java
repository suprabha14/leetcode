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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        right(root, 1, list);
        return list;
    }
    int maxL = 0;
    public void right(TreeNode root, int l, List<Integer> list) {
        if(root == null)
        return;
        if(maxL < l) {
            list.add(root.val);
            maxL = l;
        }
        right(root.right, l + 1, list);
        right(root.left, l + 1, list);
    }
}