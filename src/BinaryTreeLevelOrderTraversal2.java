import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeLevelOrderTraversal2 {
    public List<LinkedList<Integer>> levelOrderBottom(TreeNode root) {
        Stack<LinkedList<Integer>> stack = new Stack<LinkedList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<Integer>();
            int size = queue.size();
            for(int i=0; i < size;i++){
                TreeNode n = queue.poll();
                list.add(n.val);
                if(n.left!=null){
                    queue.add(n.left);
                }
                if(n.right!=null){
                    queue.add(n.right);
                }
            }
            stack.push(list);
        }
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
        while(!stack.isEmpty()){
           LinkedList<Integer> tmp = stack.pop();
            res.add(tmp);
        }
        return res;

    }
}
