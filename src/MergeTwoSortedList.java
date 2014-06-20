
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }
        ListNode head;
        if(l1.val > l2.val){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }else{
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode mark = head;
        while(l1 != null || l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val < l2.val){
                    ListNode node = new ListNode(l1.val);
                    head.next = node;
                    head = head.next;
                    l1 = l1.next;
                }else{
                    ListNode node = new ListNode(l2.val);
                    head.next = node;
                    head = head.next;
                    l2 = l2.next;
                }
            }else if(l1 == null && l2 !=null){
                ListNode node = new ListNode(l2.val);
                head.next = node;
                head = head.next;
                l2 = l2.next;
            }else if(l1!=null && l2 ==null){
                ListNode node = new ListNode(l1.val);
                head.next = node;
                head = head.next;
                l1 = l1.next;
            }
        }
        return mark;
    }
}
