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
    public static void inorder(TreeNode root,List<Integer> bst){
        if(root==null){
            return;
        }
        inorder(root.left,bst);
        bst.add(root.val);
        inorder(root.right,bst);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> bst=new ArrayList<>();
        inorder(root,bst);
        for(int i=1;i<bst.size();i++){
            if(bst.get(i-1)>=bst.get(i)){
                return false;
            }
        }
        return true;
    }
}