package Arrayss;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ESCE";
        System.out.println(exist(board,word));

    }

    private static boolean exist(char[][] board, String word) {
        int n= board.length;
        int m= board[0].length;
        boolean res= false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,i,j,0,n,m)){
                    res=true;
                }
            }
        }
        return res;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int k, int n, int m) {
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }
        if(board[i][j]==(word.charAt(k))){
            board[i][j]='#';
            if(k== word.length()-1){
                return true;
            }
            else if(dfs(board, word, i-1,j,k+1,n,m) || dfs(board, word, i+1,j,k+1,n,m)||
                    dfs(board, word, i,j-1,k+1,n,m)|| dfs(board, word, i,j+1,k+1,n,m)){
                return true;
            }
            board[i][j]= (word.charAt(k));
        }
        return false;
    }


}
