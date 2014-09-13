import java.util.LinkedList;
import java.util.List;

	
public class BinaryTreeLevelOrderTraversal {
    public List<LinkedList<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
        if(root!=null){
            queue.add(root);    
        }
        
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<Integer>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();    
                list.add(tmp.val);
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
