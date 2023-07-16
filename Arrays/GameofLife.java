package Arrayss;

public class GameofLife {
    public static void main(String[] args) {
        int arr[][]={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void gameOfLife(int arr[][]){
        int dir[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int count=0;
                for(int d[]:dir){
                    int p=i+d[0];
                    int q= j+d[1];

                    if(p>=0 && p< arr.length && q>=0 && q< arr[0].length && (arr[p][q]==1 || arr[p][q]==2)){
                        count++;
                    }
                }
                if(arr[i][j]==1){
                    if(count<2|| count>3){
                        arr[i][j]=2;
                    }
                }
                else{
                    if(count==3){
                        arr[i][j]=3;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]%=2;
            }
        }
    }
}
