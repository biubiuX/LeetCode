import java.util.LinkedList;
import java.util.Stack;


public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSym(root.left,root.right);
    }
    
    public boolean isSym(TreeNode left, TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }
        if(left.val == right.val){
            return isSym(left.right,right.left)&&isSym(left.left,right.right); 
        }
        return false;
    }
    
    public boolean isSymmetricII(TreeNode root){
        if(root == null){
            return true;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root.left);
        s2.push(root.right);
        while(!s1.isEmpty()||!s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            if(n1==null&&n2==null){
                continue;
            }
            if(n1==null||n2==null){
                return false;
            }
            if(n1.val!=n2.val){
                return false;
            }
            s1.push(n1.left);
            s1.push(n1.right);
            s2.push(n2.right);
            s2.push(n2.left);
        }
        return true;
    }
}
