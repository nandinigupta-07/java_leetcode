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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
         if(preorder.length!=postorder.length|| preorder==null || postorder==null) return null;
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
         } 
         return build(preorder,0,preorder.length-1,postorder,0,postorder.length-1,map);
    }
    public TreeNode build(int preorder[],int prestart,int preend,int postorder[],int poststart,int postend, HashMap<Integer,Integer> map ){
        if(prestart>preend || poststart>postend) return null;
        
        TreeNode root=new TreeNode(preorder[prestart]);
         if (prestart == preend) return root;
        int postroot=map.get(preorder[prestart+1]);
         
        int numsleft=postroot-poststart+1;
        root.left=build(preorder,prestart+1,prestart+numsleft,postorder,poststart,postroot,map);
        root.right=build(preorder,prestart+numsleft+1 , preend,postorder,postroot+1,postend-1,map);
        return root;
    }
}