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
    public int averageOfSubtree(TreeNode root) {
        if(root==null)return 0;
        int totalSum = sum(root);
        int totalCount = count(root);
        int c = 0;
        if (totalSum / totalCount == root.val) {
            c++;
        }
        c += averageOfSubtree(root.left); 
        c += averageOfSubtree(root.right);
        return c;
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.val;
    }
}