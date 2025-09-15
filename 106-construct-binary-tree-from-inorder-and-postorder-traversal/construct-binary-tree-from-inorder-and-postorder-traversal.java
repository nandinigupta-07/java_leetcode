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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null|| inorder.length!=postorder.length) return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1, postorder,0,postorder.length-1,map);
    }


    public TreeNode build(int [] inorder, int instart, int inend, int postorder[], int poststart, int postend, HashMap<Integer,Integer> map){
            if(poststart>postend || instart>inend) return null;
            TreeNode root=new TreeNode(postorder[postend]);
            int inorderroot=map.get(postorder[postend]);
                int numsleft=inorderroot-instart;
                root.left=build(inorder,instart,inorderroot-1, postorder,poststart,poststart+ numsleft-1,map);
                root.right=build(inorder,inorderroot+1,inend,postorder,poststart+numsleft,postend-1,map);

return root;



                        }
}