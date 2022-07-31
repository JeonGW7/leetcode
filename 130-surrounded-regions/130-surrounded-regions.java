class Solution {
    public void solve(char[][] board) {
        for(int i = 0; i<board.length; i++){
            for(int j  = 0; j<board[i].length; j++){
                //테두리에 있는 O일경우 B로 바꿔줌
                if(i == 0 || i == board.length -1 || j == 0 ||j == board[i].length -1){
                    if(board[i][j] == 'O'){
                        dfs(i, j, board);
                    }
                }
            }
        }
        
        for(int i = 0; i<board.length; i++){
            for(int j  = 0; j<board[i].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == 'B'){
                    board[i][j] = 'O';
                }
                
            }
        }
    }
    public void dfs(int i, int j, char[][] board){
        if(i >= 0 && i<board.length && j >=0 && j < board[i].length && board[i][j] == 'O'){
            board[i][j] = 'B';
            
            dfs(i+1, j, board);
            dfs(i-1, j, board);
            dfs(i, j+1, board);
            dfs(i, j-1, board);
        }
        return;
    }
    
}