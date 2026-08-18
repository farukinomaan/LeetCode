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
    int goodPairCount=0;
    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return goodPairCount;
        
    }

    private int[] dfs(TreeNode node, int distance){
        if(node==null){
            return new int[11];
        }
        if(node.left==null && node.right== null){
            int [] res=new int[11];
            res[1]=1;
            return res;
        }

        int[] leftDist= dfs(node.left,distance);
        int[] rightDist= dfs(node.right,distance);

        for(int l=1;l<=distance;l++){
            for(int r=1;r<=distance-l;r++){
            goodPairCount += leftDist[l]* rightDist[r];
            }
        }
        int[] currentDistances = new int[11];
        for(int i=1;i<10;i++){
            currentDistances[i+1]=leftDist[i]+rightDist[i];
        }
    return currentDistances;
    }
}