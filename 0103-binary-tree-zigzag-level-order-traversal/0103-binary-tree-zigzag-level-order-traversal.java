/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public void zigzag(List<List<Integer>> ans, int level, TreeNode curr) {
        if (curr == null)
            return;
        if (ans.size() <= level)
            ans.add(new ArrayList<Integer>());
        if (level % 2 == 0)
            ans.get(level).add(curr.val);
        else
            ans.get(level).add(0, curr.val);
        zigzag(ans, level + 1, curr.left);
        zigzag(ans, level + 1, curr.right);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        zigzag(ans, 0, root);
        return ans;
    }
}