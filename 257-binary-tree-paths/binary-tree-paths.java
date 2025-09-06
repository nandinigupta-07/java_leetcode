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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();  
         if(root==null) return ans;
          isPath(root, "" , ans);
        return ans;
    }
    public void isPath(TreeNode node, String path, List<String> ans){
         
       if(node==null) return ;
       if(path.isEmpty()){
        path=""+node.val;
       }else{
        path=path+"->"+node.val;
       }
        if(node.left==null && node.right==null){
            ans.add(path);
        }
        isPath(node.left, path , ans);
        isPath(node.right, path, ans);
    }
}