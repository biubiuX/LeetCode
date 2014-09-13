	
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast.next==null||fast.next.next==null){
            return null;
        }
        while(head!=fast){
            head=head.next;
            fast=fast.next;
        }
        return head;
    }
}
