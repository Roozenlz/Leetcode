package offer.offer12;

/**
 * @author Roozen
 * @version 1.0
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i =0;i<board.length;i++){
            for(int j =0 ;j<board[i].length;j++){
                if(dfs(board,words,i,j,0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,char[] words, int i, int j, int k){

        if(i<0 ||i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]!=words[k]){
            return false;
        }
        if(k==words.length-1){
            return true;
        }
        board[i][j]='\0';
        boolean res = dfs(board,words,i+1,j,k+1) || dfs(board,words,i-1,j,k+1) ||
                dfs(board,words,i,j+1,k+1) || dfs(board,words,i,j-1,k+1);
        board[i][j]=words[k];
        return res;
    }

    /*
    *     public boolean exist(char[][] board, String word) {
        int k =0;
        for(int i =0;i<board.length;i++){
            for(int j =0 ;j<board[i].length;j++){
                if(dfs(board,word,i,j,k)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,String word, int i, int j, int k){
        if(i<0 ||i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]!=word.charAt(k)){
            return false;
        }
        if(k==word.length()-1){
            return true;
        }
        board[i][j]='\0';
        boolean res = dfs(board,word,i+1,j,k+1) || dfs(board,word,i-1,j,k+1) ||
        dfs(board,word,i,j+1,k+1) || dfs(board,word,i,j-1,k+1);
        board[i][j]=word.charAt(k);
        return res;
    }v
    * */
}
