package Arrayss;

import java.util.PriorityQueue;

public class MaxValueOfEq {

   public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>((a,b)-> b.getKey()-a.getKey());
        int ans= Integer.MIN_VALUE;
        for(int[] p:points){
            while(!pq.isEmpty() && p[0]- pq.peek().getValue() >k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                ans= Math.max(ans, p[0]+p[1]+ pq.peek().getKey());
            }
            pq.offer(new Pair<Integer,Integer>(p[1]-p[0], p[0]));
        }
        return ans;
   }
}
