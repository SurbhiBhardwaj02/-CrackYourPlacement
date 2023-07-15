package LinkedList;

public class DelDupLicatesInSortedArr {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        int prev= head.val;
        ListNode temp= head;
        while(temp.next!= null){
            if(temp.next.val==prev){
                temp.next= temp.next.next;
            }
            else{
                prev= temp.next.val;
                temp= temp.next;
            }
        }
        return head;
    }
}
