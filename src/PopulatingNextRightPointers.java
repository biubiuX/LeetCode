
public class PopulatingNextRightPointers {
    public void connect(TreeLinkNode root) {
        if(root == null||root.left == null){
            return;
        }
        TreeLinkNode first = root;
        if(root.left!=null){
            root.left.next = root.right;
        }
        while(root.next!=null){
            root.right.next = root.next.left;
            root = root.next;
            root.left.next = root.right;
        }
        connect(first.left);
    }
}
