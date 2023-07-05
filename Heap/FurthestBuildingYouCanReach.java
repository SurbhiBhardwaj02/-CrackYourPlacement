package Heap;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int arr[]={4,2,7,6,9,14,12};
        int ladder=2;
        int bricks=2;
        System.out.println(furthestBuilding(arr,ladder,bricks));
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i=0;i<heights.length-1;i++){
            if(heights[i]<heights[i+1]){
                pq.add(heights[i+1]-heights[i]);
            }
            if(pq.size()>ladders){
                bricks-=pq.poll();
            }
            if(bricks<0){
                return i;
            }
        }
        return heights.length -1;
    }
}
