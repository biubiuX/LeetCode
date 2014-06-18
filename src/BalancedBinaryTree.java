
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (Math.abs(treeHeight(root.left)-treeHeight(root.right))>1){
            return false;
        }else{
            return isBalanced(root.left)&&isBalanced(root.right);
        }
    }
    
    public int treeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }
    
    
    public boolean isBalanced2(TreeNode root) {
        if (root == null){
            return true;
        }
        if(treeHeight2(root) == -1){
            return false;
        }else{
            return true;
        }
    }
    
    public int treeHeight2(TreeNode root){
        if(root == null){
            return 0;
        }
        int heightLeft = treeHeight2(root.left);
        if (heightLeft==-1){
            return -1;
        }
        int heightRight = treeHeight2(root.right);
        if (heightRight == -1){
            return -1;
        }
        
        if (Math.abs(heightLeft - heightRight) > 1){
            return -1;
        }else{
            return Math.max(heightLeft, heightRight)+1;    
        }
        
    }
}
