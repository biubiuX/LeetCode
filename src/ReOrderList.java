import java.util.Stack;


public class ReOrderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next ==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        while(slow!=null){
            stack.push(slow);
            slow = slow.next;
        }
        while(!stack.isEmpty()){
            ListNode next = head.next;
            head.next = stack.pop();
            head = head.next;
            head.next = next;
            head = head.next;
        }
        if(head.next!=null){
            head.next = null;
        }
    }
}
