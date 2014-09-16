
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode scanner = head;
        for(int i =0;i<n;i++){
            scanner=scanner.next;
        }
        if(scanner == null){
            pre = pre.next;
            head.next = null;
            return pre;
        }
        while(scanner.next!=null){
            pre = pre.next;
            scanner=scanner.next;
        }
        ListNode next = pre.next.next;
        pre.next.next = null;
        pre.next = next;
        return head;
    }
}
