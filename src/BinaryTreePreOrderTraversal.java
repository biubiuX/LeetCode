import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// 1) Create an empty stack nodeStack and push root node to stack.
// 2) Do following while nodeStack is not empty.
// бн.a) Pop an item from stack and print it.
// бн.b) Push right child of popped item to stack
// бн.c) Push left child of popped item to stack
public class BinaryTreePreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        preoder(root, list);
        return list;
    }
    
    public void preoder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preoder(root.left,list);
        preoder(root.right,list);
    }
    
    public List<Integer> preorderTraversal2(TreeNode root){
    	// Use iterative method
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new LinkedList<Integer>();
        if(root!=null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if(cur.right!=null){
                stack.push(cur.right);    
            }
            if(cur.left!=null){
                stack.push(cur.left);    
            }
            
        }
        return list;
    }
    
}
