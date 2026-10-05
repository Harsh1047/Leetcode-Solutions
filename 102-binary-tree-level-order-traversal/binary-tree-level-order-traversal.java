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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> arl = new ArrayList<>();
        if(root == null) return arl;
        queue.offer(root);
        while(!queue.isEmpty()){
            int lev = queue.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0;i<lev;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                sub.add(queue.poll().val);
            }
            arl.add(sub);
        }
        return arl;
    }
}