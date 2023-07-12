package Arrayss;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int maxr= matrix.length-1;
        int maxc= matrix[0].length-1;
        int k= (maxr+1)*(maxc+1);
        int c=0;
        int minc=0,minr=0;

        while(c<k){
            for(int i=minc;i<=maxc && c<k;i++){
                list.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<k;i++){
                list.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<k;i--){
                list.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<k;i--){
                list.add(matrix[i][minc]);
                c++;
            }
            minc++;

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
