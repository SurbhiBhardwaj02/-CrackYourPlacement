package Arrayss;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm
        int count=0;
        int cur= 0;
        for(int num:nums){
            if(count==0){
                cur=num;
            }
            if(cur==num) count++;
            else count--;
        }
        return cur;
    }
}
