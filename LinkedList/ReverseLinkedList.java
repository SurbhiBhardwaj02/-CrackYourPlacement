package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode ahead=curr;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }}
