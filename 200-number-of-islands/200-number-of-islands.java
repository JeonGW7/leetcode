class Solution {
    int answer=0;
    
    public int numIslands(char[][] grid) {
        for(int i=0;i<grid.length; i++){
            for(int j=0;j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j);
                            answer++;

                }
            }
        }
        return answer;
    }
    
    public void dfs(char[][] grid, int m, int n){
        if(m<0 || m>=grid.length || n<0 || n>=grid[0].length || grid[m][n]=='0'){
            return;
        }
        grid[m][n]='0';
        dfs(grid, m+1, n);
        dfs(grid, m-1,n);
        dfs(grid, m, n+1);
        dfs(grid, m, n-1);
    }
}