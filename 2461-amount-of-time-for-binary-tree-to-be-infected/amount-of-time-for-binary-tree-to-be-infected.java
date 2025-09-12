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
    public void parent_mark(TreeNode root,Map<TreeNode, TreeNode> Parent_track){
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current.left!=null){
                Parent_track.put(current.left,current);
                queue.offer(current.left);
            }
            if(current.right!=null){
                Parent_track.put(current.right,current);
                queue.offer(current.right);
            }
        }
    }
    private TreeNode findNode(TreeNode root, int start) {
    if (root == null) return null;
    if (root.val == start) return root;
    TreeNode left = findNode(root.left, start);
    if (left != null) return left;
    return findNode(root.right, start);
}

    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode , TreeNode> Parent_track =new HashMap<>();
        parent_mark(root, Parent_track);
        Map<TreeNode , Boolean> visited = new HashMap<>();  
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
          TreeNode target = findNode(root, start);
        queue.offer(target);
        visited.put(target, true);
        int curr_level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            curr_level++;
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                if(current.left!=null && visited.get(current.left)==null){
                    queue.offer(current.left);
                    visited.put(current.left,true);
                }
                 if(current.right!=null && visited.get(current.right)==null){
                    queue.offer(current.right);
                    visited.put(current.right,true);
                }
                 if(Parent_track.get(current)!=null && visited.get(Parent_track.get(current))==null){
                    queue.offer(Parent_track.get(current));
                    visited.put(Parent_track.get(current),true);
                }
            }
        }
        return curr_level-1;
    }
}