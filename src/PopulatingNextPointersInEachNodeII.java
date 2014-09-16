import java.util.LinkedList;


public class PopulatingNextPointersInEachNodeII {
    public void connect(TreeLinkNode root) {
        LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                
                if(i==size-1){
                    TreeLinkNode tmp = queue.pollFirst();
                    tmp.next = null;
                    if(tmp.left!=null){
                        queue.add(tmp.left);
                    }
                    if(tmp.right!=null){
                        queue.add(tmp.right);
                    }
                }else{
                    TreeLinkNode tmp = queue.pollFirst();
                    tmp.next = queue.peekFirst();
                    if(tmp.left!=null){
                        queue.add(tmp.left);
                    }
                    if(tmp.right!=null){
                        queue.add(tmp.right);
                    }
                }
            }
        }
    }
}
