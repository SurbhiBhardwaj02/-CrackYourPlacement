package Heap;

import java.util.Stack;

public class FindMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<nums.length;i++){

            while(!st.isEmpty() && st.size()+nums.length-i>k && nums[i]<st.peek()){
                st.pop();
            }

            if(st.size()<k){
                st.push(nums[i]);
            }
        }
        int res[]=new int[k];
        int i=k-1;
        while(!st.isEmpty()){
            res[i--]= st.pop();

        }
        return res;
    }
}
