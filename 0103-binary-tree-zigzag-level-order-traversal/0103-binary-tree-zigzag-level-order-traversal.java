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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean lefttoright=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> subans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode p=q.poll();
                if(lefttoright){
                    subans.add(p.val);
                }
                else{
                    subans.add(0,p.val);
                }
                if(p.left!=null){
                    q.offer(p.left);
                }
                if(p.right!=null){
                    q.offer(p.right);
                }
            }
            lefttoright=!lefttoright;
            ans.add(subans);
        }
        return ans;
    }
}