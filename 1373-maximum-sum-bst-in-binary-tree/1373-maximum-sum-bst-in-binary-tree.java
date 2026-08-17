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
    int ans=0;
    public int maxSumBST(TreeNode root) {
        solve(root);
        return ans;
    }
    public int[] solve(TreeNode root){
        if(root==null){
            return new int[] {1,0,Integer.MAX_VALUE,Integer.MIN_VALUE};
        }
        int[] l = solve(root.left);
        int[] r = solve(root.right);

        if (l[0] == 1 && r[0] == 1 && root.val > l[3] && root.val < r[2]) {
            int sum = root.val + l[1] + r[1];
            ans = Math.max(ans, sum);
            return new int[]{
                1, sum,
                Math.min(root.val, l[2]),
                Math.max(root.val, r[3])
            };
        }
        return new int[]{0, 0, 0, 0};
    }
}