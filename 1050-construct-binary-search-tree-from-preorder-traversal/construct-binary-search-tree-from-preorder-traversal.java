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
    public TreeNode bstFromPreorder(int[] preorder) {
        int inorder []= preorder.clone();
        Arrays.sort(inorder);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    public TreeNode buildtree(int preorder[],int prestart,int preend,int inorder[],int instart,int inend,Map<Integer,Integer> map){
        if(prestart>preend || instart>inend) return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=map.get(root.val);
        int numsleft=inroot-instart;
        root.left=buildtree(preorder,prestart+1,prestart+numsleft,inorder,instart,inroot-1,map);
        root.right=buildtree(preorder,prestart+numsleft+1,preend,inorder,inroot+1,inend,map);
        return root;
    }
}