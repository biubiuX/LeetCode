
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode res = head.next;
        ListNode pre = head;
        ListNode next = head.next.next;
        head.next.next = head;
        head.next = next;
        ListNode scan = next;
        while(scan!=null&&scan.next!=null){
            pre.next = scan.next;
            pre = scan;
            next = scan.next.next;
            scan.next.next = scan;
            scan.next = next;
            scan = next;
        }
        return res;
    }
}
