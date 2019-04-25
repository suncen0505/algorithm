/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {


    public int findSecondMinimumValue(TreeNode root) {
        
        if(root==null){
            return -1;
        }
        
        return getLstNode(root,root.val);
    }
    
    private int getLstNode(TreeNode root,int value){

        if(root==null){
            return -1;
        }
        
        if(root.val>value){
            return root.val;
        }
        
        int left=getLstNode(root.left,value);
        int right=getLstNode(root.right,value);
        
        System.out.print("root.val:"+root.val+";value:"+value+";left:"+left+";right:"+right+"------------");
        
        //重要的是理解 如果到了叶子节点，如果另一个比他大，即使另一个不是叶子节点，也是到了比他大一点的（即倒数第二）的数
        
        if(left>=0&&right>=0){
            return left<right?left:right;
        }
        

        return left<right?right:left;
        
    }
    
    
   
}