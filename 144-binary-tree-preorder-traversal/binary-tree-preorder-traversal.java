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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arl = new ArrayList<>();
        traverse(root, arl);
        return arl;
    }
    public void traverse(TreeNode node, List<Integer> arl){
        if(node==null) return;
        arl.add(node.val);
        traverse(node.left, arl);
        traverse(node.right, arl);
    }
}