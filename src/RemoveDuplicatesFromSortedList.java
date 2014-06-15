
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode runner = head.next;
        ListNode pre = head;
        while(runner!=null){
            ListNode next = runner.next;
            if(pre.val!=runner.val){
                pre.next = runner;
                pre = pre.next;
            }else{
                pre.next = null;
            }
            runner = next;
        }
        return head;
    }
}
