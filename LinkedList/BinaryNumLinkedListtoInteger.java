package LinkedList;

public class BinaryNumLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        ListNode temp= head;
        int c=0, ans=0;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        temp= head;
        while(temp !=null){
            int num= temp.val;
            if(num==1) ans+= Math.pow(2,c);
            c--;
            temp= temp.next;
        }
        return ans;
    }
}
