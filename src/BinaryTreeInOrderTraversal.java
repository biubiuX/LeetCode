import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// 1) Create an empty stack S.
// 2) Initialize current node as root
// 3) Push the current node to S and set current = current->left until current is NULL
// 4) If current is NULL and stack is not empty then 
//     a) Pop the top item from stack.
//     b) Print the popped item, set current = current->right 
//     c) Go to step 3.
// 5) If current is NULL and stack is empty then we are done.

public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
         while(!stack.isEmpty()||root!=null){
            if(root == null){
                TreeNode cur = stack.pop();
                list.add(cur.val);
                root = cur.right;
            }else{
                stack.push(root);
                root = root.left;
            }
        }
        return list;
    }
}
