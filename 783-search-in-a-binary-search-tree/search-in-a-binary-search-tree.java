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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode pp=root;
        while(pp!=null){
             if(pp.val==val){
                return pp;
             }
             if(pp.val>val){
                pp=pp.left;
             }
             else{
                pp=pp.right;
             }
        }
        return null;
    }
}