package Heap;

import java.util.PriorityQueue;

public class KClosestPointstoOrigin {

    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        int res[][]=kClosest(points,k);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> (x[0] * x[0] + x[1] * x[1]) - (y[0] * y[0] + y[1] * y[1]));
        for (int[] p : points) {
            pq.add(p);
        }
        int res[][] =new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i]=pq.poll();
        }
        return res;
    }
}
