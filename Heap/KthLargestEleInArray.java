package Heap;

import java.util.PriorityQueue;

public class KthLargestEleInArray {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k=4;

        PriorityQueue<Integer> pq= new PriorityQueue<>();// min heap
        //PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());// max Heap

        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
