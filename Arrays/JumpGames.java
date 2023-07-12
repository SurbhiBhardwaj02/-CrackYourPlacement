package Arrayss;

public class JumpGames {
    public static void main(String[] args) {
        System.out.println(jumpGames(new int[]{1,1,2,5,2,1,0,0,1,3}));
    }
    //Valley Peak Approach
    private static boolean jumpGames(int[] ints) {
        int reachable=0;
        for(int i=0;i< ints.length;i++){
            if(reachable<i){
                return false;
            }
            reachable= Math.max(reachable, i+ints[i]);
        }
        return true;
    }

}
