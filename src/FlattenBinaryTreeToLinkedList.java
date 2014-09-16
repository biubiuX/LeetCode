import java.util.Stack;


public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null){
            return;
        }
        stack.push(root);
        TreeNode prev = null;
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
            if(prev!=null){
                prev.left = null;
                prev.right = cur;
            }
            prev = cur;
        }

    }
}
