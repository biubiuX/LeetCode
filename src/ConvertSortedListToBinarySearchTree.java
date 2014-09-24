
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head ==null){
            return null;
        }
        ListNode scan = head;
        int len=1;
        while(scan.next!=null){
            scan = scan.next;
            len++;
        }
        ListNode[] headholder = {head};
        return createBST(headholder,0,len-1);
    }
    
    public TreeNode createBST(ListNode[] head, int start, int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode left = createBST(head,start,mid-1);
        TreeNode parent = new TreeNode(head[0].val);
        parent.left = left;
        head[0] = head[0].next;
        parent.right = createBST(head,mid+1,end);
        return parent;
    }
}
