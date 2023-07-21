package LinkedList;

public class MergeSortedLinkedList {
    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {
        ListNode1 res=new ListNode1();
        ListNode1 curr=res;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next= l1!=null ? l1 :l2;
        return res.next;
    }
}
class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}