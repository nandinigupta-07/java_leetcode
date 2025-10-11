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
    public TreeNode insertIntoBST(TreeNode root, int x) {
        if(root==null) return new TreeNode(x);
        TreeNode curr=root;
        while(curr!=null){
            if(curr.val>x){
                 if(curr.left==null){
                     TreeNode left=new TreeNode(x);
                     curr.left=left;
                     break;
                 }else{
                    curr=curr.left;
                 }      
            }
            else{
                if(curr.val<x){
                    if(curr.right==null){
                        TreeNode right=new TreeNode(x);
                        curr.right=right;
                        break;
                    }
                    else{
                        curr=curr.right;
                    }
                }
            }
             
        }
        return root;
    }
}